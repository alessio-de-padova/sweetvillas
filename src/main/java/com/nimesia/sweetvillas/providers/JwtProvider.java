package com.nimesia.sweetvillas.providers;

import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.JWT;
import com.nimesia.sweetvillas.config.SecurityConfig;
import com.nimesia.sweetvillas.entities.UserEntity;
import org.joda.time.DateTime;

public class JwtProvider {

    private static final String issuer = "sweetvillas-service";

    /**
     * Create jwt string.
     *
     * @param user the user entity
     * @return the JWT string
     */
    public static String createJwt(  UserEntity user, Integer seconds) {

        JWTCreator.Builder builder = JWT.create()
                .withSubject(user.getId())
                .withIssuer(issuer)
                .withIssuedAt(DateTime.now().toDate())
                .withClaim("role", user.getRole().getId())
                .withExpiresAt(DateTime.now().plusSeconds(seconds).toDate());

        return builder.sign(Algorithm.HMAC256(SecurityConfig.secret));
    }

    /**
     * Verify jwt decoded.
     *
     * @param jwt the JWT string
     * @return the decoded JWT
     */
    public static DecodedJWT verifyJwt(String jwt) {
        return JWT.require(Algorithm.HMAC256(SecurityConfig.secret))
                .build()
                .verify(jwt);
    }

}