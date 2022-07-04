package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public abstract class BaseEntity {
    private LocalDate createDate;
    private LocalDate updateDate;
}
