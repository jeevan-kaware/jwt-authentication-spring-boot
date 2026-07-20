package jeevan.Practice1.Security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.grammars.hql.HqlParser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {

    private static final String SECRETE_KEY =
            Base64.getEncoder().encodeToString(
                    "My-super-secrete-key-My-super-secrete-key".getBytes()
            );
        public String generateToken(String email){
            Map<String,Integer> claims = new HashMap<>();
            return Jwts.builder()
                    .claims()
                    .add(claims)
                    .subject(email)
                    .issuedAt(new Date(System.currentTimeMillis()))
                    .expiration(new Date(System.currentTimeMillis() + 1000L * 60 * 30))
                    .and()
                    .signWith(getKey())
                    .compact();
        }
       private SecretKey getKey(){
           byte[] key =  Base64.getDecoder().decode(SECRETE_KEY);
           return Keys.hmacShaKeyFor(key);
       }
       public String extractEmail(String token){
            return extractClaims(token,Claims::getSubject);
       }
       public boolean validateToken(String token,UserDetails userDetails){
            final String email = extractEmail(token);
            return email.equals(userDetails.getUsername()) && !isExpired(token);
        }
        private boolean isExpired(String token){
                   return extractClaims(token , Claims::getExpiration).before(new Date());
        }
       private <T> T extractClaims(String token,
                                   Function<Claims,T> claimResolver){
            Claims claims = extractAllClaims(token);
            return claimResolver.apply(claims);
       }
       private Claims extractAllClaims(String token){
            return Jwts.parser()
                    .verifyWith(getKey())
                    .build()
                    .parseSignedClaims(token)
                    .getPayload();
       }
}

