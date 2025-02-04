/**
 * @author Yuri Santos
 * @since 30-01-2025
 * @version 1.0
 */

package br.com.flexreserve.flex_reserve.entity;

import br.com.flexreserve.flex_reserve.enums.StatusProduct;
import jakarta.persistence.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Double value;
    private String description;
    @ElementCollection
    @CollectionTable(name = "product_tags", joinColumns = @JoinColumn(name = "product_id"))
    @Fetch(FetchMode.JOIN)
    @Column(name = "tag")
    private List<String> tags;
    private LocalDate created_at;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private StatusProduct status;

    @PrePersist
    public void prePersist() {
        if (this.created_at == null) {
            this.created_at = LocalDate.now();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    public StatusProduct getStatus() {
        return status;
    }

    public void setStatus(StatusProduct status) {
        this.status = status;
    }

}

