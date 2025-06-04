package za.ac.cput.healthapp.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String gender;
    private LocalDate dob;
    private String address;
    private String emergencyContact;

    public Patient() {
        // Default constructor
    }

    public Patient(Builder builder) {
        this.patientId = builder.patientId;
        this.user = builder.user;
        this.gender = builder.gender;
        this.dob = builder.dob;
        this.address = builder.address;
        this.emergencyContact = builder.emergencyContact;
    }

    public Long getPatientId() {
        return patientId;
    }

    public User getUser() {
        return user;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    // Builder
    public static class Builder {
        private Long patientId;
        private User user;
        private String gender;
        private LocalDate dob;
        private String address;
        private String emergencyContact;

        public Builder setPatientId(Long patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder setUser(User user) {
            this.user = user;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setDob(LocalDate dob) {
            this.dob = dob;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmergencyContact(String emergencyContact) {
            this.emergencyContact = emergencyContact;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }
    }
}
