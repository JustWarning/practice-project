package com.practice.practice_project.service.feign;

import com.practice.practice_project.dto.request.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "NOTIFICATION-CLIENT", url = "${notificationApi}")
public interface NotificationClient {
    @PostMapping("/send")
    void sendNotification(@RequestBody NotificationRequest request);
}
