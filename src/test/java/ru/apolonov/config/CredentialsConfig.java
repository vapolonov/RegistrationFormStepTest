package ru.apolonov.config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:resources/config/credentials.properties"})
public interface CredentialsConfig extends Config {
    String login();
    String password();
}
