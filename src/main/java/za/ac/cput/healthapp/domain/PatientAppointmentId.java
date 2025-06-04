package za.ac.cput.healthapp.domain;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class PatientAppointmentId implements Serializable {
    private Long patientId;
    private Long appointmentId;

}
