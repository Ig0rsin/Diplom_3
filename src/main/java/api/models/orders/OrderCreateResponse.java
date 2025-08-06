package api.models.orders;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderCreateResponse {
    private boolean success;
    private String name;
    private Order order;
}

/* public class OrderCreateResponse {
    private boolean success;
    private String name;
    private Order order;

    public OrderCreateResponse(boolean success, String name, Order order) {
        this.success = success;
        this.name = name;
        this.order = order;
    }

    public OrderCreateResponse(){
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
} */
