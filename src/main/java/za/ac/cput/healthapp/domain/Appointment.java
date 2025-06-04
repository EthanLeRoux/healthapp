package za.ac.cput.healthapp.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private LocalDateTime appointmentDate;

    private String status;

    private String notes;

    public Appointment() {
        // Default constructor
    }

    public Appointment(Builder builder) {
        this.appointmentId = builder.appointmentId;
        this.patient = builder.patient;
        this.appointmentDate = builder.appointmentDate;
        this.status = builder.status;
        this.notes = builder.notes;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public Patient getPatient() {
        return patient;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public String getStatus() {
        return status;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", patient=" + patient +
                ", appointmentDate=" + appointmentDate +
                ", status='" + status + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }

    public static class Builder {
        private Long appointmentId;
        private Patient patient;
        private User doctor;
        private LocalDateTime appointmentDate;
        private String status;
        private String notes;

        public Builder setAppointmentId(Long appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        public Builder setPatient(Patient patient) {
            this.patient = patient;
            return this;
        }

        public Builder setDoctor(User doctor) {
            this.doctor = doctor;
            return this;
        }

        public Builder setAppointmentDate(LocalDateTime appointmentDate) {
            this.appointmentDate = appointmentDate;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setNotes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder copy(Appointment appointment) {
            this.appointmentId = appointment.appointmentId;
            this.patient = appointment.patient;
            this.appointmentDate = appointment.appointmentDate;
            this.status = appointment.status;
            this.notes = appointment.notes;
            return this;
        }

        public Appointment build() {
            return new Appointment(this);
        }
    }
}