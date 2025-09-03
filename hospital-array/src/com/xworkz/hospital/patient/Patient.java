package com.xworkz.hospital.patient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Patient {

    private int patientId;
    private String patientName;
    private String location;
    private String doctorName;
}
