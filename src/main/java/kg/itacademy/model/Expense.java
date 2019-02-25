package kg.itacademy.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@XmlRootElement(name="expense")
@XmlAccessorType(XmlAccessType.FIELD)
public class Expense {
    private int id;
    private Category category;
    private BigDecimal amount;
    private String description;
    private User user;
    private Wallet wallet;
    private boolean isExpense;
    private LocalDateTime dateCreated;

    public Expense() {
    }

    public Expense(int id, Category category, BigDecimal amount, String description, User user, Wallet wallet, boolean isExpense) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.user = user;
        this.wallet = wallet;
        this.isExpense = isExpense;
    }

    public boolean isExpense() {
        return isExpense;
    }

    public void setExpense(boolean expense) {
        isExpense = expense;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
