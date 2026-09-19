# FoodGo — 物件導向軟體工程 學期專題範例

依照 [物件導向軟體工程作業規定.md](物件導向軟體工程作業規定.md) 的每週規定,以「線上點餐外送系統 FoodGo」為範例題目,逐項產出對應文件與程式碼,供小組實際專題參考格式使用。**實際內容(題目、分組、系統設計)仍需依你們小組真正選定的專題調整**,此處僅示範每個項目「至少一個完整例子」的寫法。

## 文件對照表

| 檔案 | 對應規定週次 | 內容摘要 |
|---|---|---|
| [物件導向軟體工程作業規定.md](物件導向軟體工程作業規定.md) | 全學期 | 原始作業規定(來源文件) |
| [01_專題題目與分組.md](01_專題題目與分組.md) | 9/19、10/3 | 分組名單格式、專題題目與選題理由、OO 特性分析、UML 工具建議 |
| [02_需求分析文件.md](02_需求分析文件.md) | 10/17、11/7 | Requirements Analysis Document:Introduction、三個類似系統比較、12 項功能性需求、3.3.1–3.3.11 全部非功能性需求問答 |
| [03_劇本與使用案例.md](03_劇本與使用案例.md) | 11/14、11/21 | Scenario(劇本情境,真實人名)+ 正式 Use Case Model(`PlaceOrder`) |
| [04_類別識別與類別圖.md](04_類別識別與類別圖.md) | 11/21 | 文字分析(名詞/動詞/形容詞)、Data Dictionary、類別圖(PlantUML)、繼承 / 擁有(聚合) / Qualification 三個範例 |
| [05_動態模型_循序圖與活動圖.md](05_動態模型_循序圖與活動圖.md) | 11/28 | MVC 循序圖(Actor→View→Control→Model)、含 fork/join 並行設計的活動圖 |
| [06_狀態圖與導覽路徑.md](06_狀態圖與導覽路徑.md) | 12/5 | `Order` 的 StateChart Diagram、App 導覽路徑(樹狀結構) |

> 12/12 期末考試、12/19 期末口頭報告屬於行政流程,規定原文已列在 [物件導向軟體工程作業規定.md](物件導向軟體工程作業規定.md) 末段,無須另外產出範例文件。

[result.md](result.md) 是把上述 01–06 六份文件彙整成單一檔案的整合版報告,UML 圖已改用 [images/](images) 目錄下渲染好的 JPG 圖檔內嵌,不需要另外安裝 PlantUML 就能直接看到圖。

## 程式碼

[src/main/java/foodgo/](src/main/java/foodgo) — 依照 [04_類別識別與類別圖.md](04_類別識別與類別圖.md) 的類別圖實作,共 18 個 Java 類別:

- `User`(抽象)→ `Customer` / `Merchant` / `DeliveryRider` / `Admin`(繼承範例)
- `MenuItem`(抽象)→ `MainDish` / `Beverage` / `Dessert`(繼承範例)
- `Payment`(抽象)→ `CashPayment` / `CreditCardPayment` / `EWalletPayment`(繼承範例)
- `Restaurant` 擁有多個 `MenuItem`、`Order` 擁有多個 `OrderItem`(聚合範例)
- `Customer` 以 `orderId` 為 key 直接定位訂單(Qualification 範例)
- `Main.java` 執行完整下單流程(對應 03 的劇本情境)

### 執行方式

```bash
cd /Users/liqingbao/workspace_paul/oo_report
javac -d out $(find src/main/java -name "*.java")
java -cp out foodgo.Main
```

`out/` 為編譯產物,非原始碼,可用 `rm -rf out` 隨時清除重建。

## 本機預覽 UML 圖

各文件內的圖以 PlantUML 文字碼撰寫。本機已安裝 `plantuml` + `graphviz`,並在 [.vscode/settings.json](.vscode/settings.json) 設定好 jar 路徑,於 VSCode 開啟任一份 `.md` 檔後按 `Cmd+Shift+V` 即可離線預覽出圖。
