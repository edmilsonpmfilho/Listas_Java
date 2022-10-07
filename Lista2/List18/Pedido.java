package POO_List.List18;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;



public class Pedido {
    private Date dataPedido;
    private boolean status;
    private ItemPedido item;
    private BigDecimal valorTotal;

    ArrayList<ItemPedido> itemPedido;
    public Date getDataPedido() {
        return dataPedido;
    }
    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }
    public boolean isStatus() {
        return status;
    }
    public ItemPedido getItem() {
        return item;
    }
    public void setItem(ItemPedido item) {
        this.item = item;
    }
    public ArrayList<ItemPedido> getItemPedido() {
        return itemPedido;
    }
    public void setItemPedido(ArrayList<ItemPedido> itemPedido) {
        this.itemPedido = itemPedido;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void statusPedido(){

    }
    
    
}
