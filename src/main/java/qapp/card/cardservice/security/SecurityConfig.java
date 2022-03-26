package qapp.card.cardservice.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import qapp.card.cardservice.filter.CustomAuthorisationFilter;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;

@Configuration
@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(STATELESS);
        http.authorizeRequests().antMatchers(POST, "/card-service/retrieve-pin/**").hasAnyAuthority("CONSUMER", "MERCHANT");
        http.authorizeRequests().antMatchers(POST, "/card-service/replace/**").hasAnyAuthority("CONSUMER" , "MERCHANT");
        http.authorizeRequests().antMatchers(POST, "/card-service/block/**").hasAnyAuthority("CONSUMER" , "MERCHANT");
        http.authorizeRequests().antMatchers(POST, "/card-service/checkCard/**").hasAnyAuthority("CONSUMER" , "MERCHANT");
        http.addFilterBefore(new CustomAuthorisationFilter(), UsernamePasswordAuthenticationFilter.class);
    }

}

