# Personal-Finance-Tracker-Spring-Boot-H2-Database-
Java, Spring Boot, REST API, Database
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // income/expense
    private double amount;
    private String description;

    // getters + setters
}
