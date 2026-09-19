package foodgo;

/**
 * 對應 06_狀態圖與導覽路徑.md 的 Order StateChart。
 */
public enum OrderStatus {
    CREATED,
    PREPARING,
    READY_FOR_PICKUP,
    DELIVERING,
    DELIVERED,
    CANCELLED
}
