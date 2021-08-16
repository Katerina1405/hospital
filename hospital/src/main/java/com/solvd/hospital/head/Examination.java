package com.solvd.hospital.head;

import com.solvd.hospital.general.Entity;
import com.solvd.hospital.hospitalization.Hospitalization;

import java.sql.Date;
import java.util.Objects;


public class Examination implements Entity {
    private long id;
    private String comment;
    private Date date;
    private Hospitalization hospitalization;
    private List<head.Assignment> assignments;
    private List<head.Diagnose> diagnoses;

    public Examination() {
    }

    public Examination(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getComment() {
        return comment;
    }

    public Hospitalization getHospitalization() {
        return hospitalization;
    }

    public List<head.Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public List<head.Assignment> getAssignments() {
        return assignments;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setHospitalization(Hospitalization hospitalization) {
        this.hospitalization = hospitalization;
    }

    public void setDiagnoses(List<head.Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public void setAssignments(List<head.Assignment> assignments) {
        this.assignments = assignments;
    }


    @Override
    public int hashCode() {

        return Objects.hash(id, date, diagnoses, assignments);
    }

    @Override
    public String toString() {
        return "Examination{" +
                "id=" + id +                ", comment='" + comment + '\'' +
                ", date=" + date +
                ", hospitalization=" + hospitalization +
                ", assignments=" + assignments +
                ", diagnoses=" + diagnoses +
                '}';
    }

    @Override
    public void setHomePatient(String name) {

    }

    @Override
    public void setVisitingPatient(String name) {

    }

    @Override
    public void homePatientData(int points) {

    }

    @Override
    public void visitingPatientData(int points) {

    }

    @Override
    public void PatientCard(String data) {

    }
}