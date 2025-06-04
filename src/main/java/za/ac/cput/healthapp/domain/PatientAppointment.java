package za.ac.cput.healthapp.domain;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PatientAppointment {
    @EmbeddedId
    PatientAppointmentId id;
    private String status;
}