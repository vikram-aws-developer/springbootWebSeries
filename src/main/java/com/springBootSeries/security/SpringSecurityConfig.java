package com.springBootSeries.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
		.inMemoryAuthentication()
		.withUser("admin")
		.password("allowadmin")
		.roles("ADMIN");
		
		
		auth
		.inMemoryAuthentication()
		.withUser("vikram")
		.password("allowvikram")
		.roles("USER");
		
		
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/AuthRequired/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
	}
	
	

@Bean
public static NoOpPasswordEncoder  passwordEncoder()
{
	return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
}

}






//Security on each and every HTTP request 
/*
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * 
 * http.csrf().disable();
 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
 * 
 * }
 */




//Security based on URL
/*
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable();
 * http.authorizeRequests().antMatchers("/AuthRequired/**").fullyAuthenticated()
 * .and().httpBasic();
 * 
 * }
 */