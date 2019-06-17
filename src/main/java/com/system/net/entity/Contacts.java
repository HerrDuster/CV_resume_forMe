package com.system.net.entity;

import lombok.Data;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
@Access(AccessType.FIELD)
public class Contacts implements Serializable {


    @Column(length = 80)
    private String skype;

    @Column
    private String facebook;

    @Column
    private String linkedin;

    @Column
    private String github;

    @Column
    private String stackoverFlow;
}
