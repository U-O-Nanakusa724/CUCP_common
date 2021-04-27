package biz.uoray.cucp.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "prices")
public class Price extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_detail_id")
    private CarDetail carDetail;

    @Column(name = "price")
    private double price;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "deleted_at")
    private Date deletedAt;

    // Getter
    @Override
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    // Setter
    @Override
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
