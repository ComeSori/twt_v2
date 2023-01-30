package com.comsori.twt.data.embeddedid;

import com.comsori.twt.data.type.WeekType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class LecTimeId implements Serializable {
    @Id
    private String lecture;

    @Id
    private WeekType lec_week;

    @Id
    private LocalTime lec_start;
}
