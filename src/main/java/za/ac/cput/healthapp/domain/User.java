package za.ac.cput.healthapp.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String email;
    private String password;
    private String role;
    private String phone;
    private String status;

    private LocalDateTime createdAt;

    public User () {
        // Default constructor
    }

    public User(Builder builder) {
        this.userId = builder.userId;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
        this.role = builder.role;
        this.phone = builder.phone;
        this.status = builder.status;
        this.createdAt = builder.createdAt != null ? builder.createdAt : LocalDateTime.now();
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getPhone() {
        return phone;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public static class Builder {
        private Long userId;
        private String name;
        private String email;
        private String password;
        private String role;
        private String phone;
        private String status;
        private LocalDateTime createdAt;

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }
        public Builder setRole(String role) {
            this.role = role;
            return this;
        }
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }
        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder copy(User user) {
            this.userId = user.userId;
            this.name = user.name;
            this.email = user.email;
            this.password = user.password;
            this.role = user.role;
            this.phone = user.phone;
            this.status = user.status;
            this.createdAt = user.createdAt;
            return this;
        }



        public User build() {
            User user = new User();
            user.userId = this.userId;
            user.name = this.name;
            user.email = this.email;
            user.password = this.password;
            user.role = this.role;
            user.phone = this.phone;
            user.status = this.status;
            user.createdAt = this.createdAt != null ? this.createdAt : LocalDateTime.now();
            return user;
        }
    }


}
