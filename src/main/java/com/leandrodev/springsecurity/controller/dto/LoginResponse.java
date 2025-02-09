package com.leandrodev.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
