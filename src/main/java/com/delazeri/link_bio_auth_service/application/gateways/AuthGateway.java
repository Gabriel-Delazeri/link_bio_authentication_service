package com.delazeri.link_bio_auth_service.application.gateways;

import com.delazeri.link_bio_auth_service.domain.entity.User;

public interface AuthGateway {
    String loginUser(User user);
}