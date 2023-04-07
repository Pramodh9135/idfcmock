package com.idfc.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class BankDto {
@Id
private int id;
private String name;
private long phnno;
private String email;
private String location;
}
