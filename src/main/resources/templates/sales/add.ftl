<#import "../page.ftl" as a>
<@a.basis>
     <div class="container " style="margin-top: 30px">
         <h2>Продажа</h2>
         <div class="form-group">
             <label for="date">Дата:</label>
             <input type="date" class="form-control" name="date" id="date">
         </div>
         <div class="form-group">
             <label for="name">Контрагент:</label>
             <select type="text" class="form-control comp" id="name">
                <#list counterPartiesList as counterparties>
                    <option value="${counterparties.id}">${counterparties.name}</option>
                </#list>
             </select>
         </div>
         <div class="form-group">
             <label for="name">Продукция:</label>
             <select type="text" class="form-control products" id="name">
                <#list productsList as products>
                    <option value="${products.id}" data-id="${products.price}">${products.name}</option>
                </#list>
             </select>
         </div>
         <div class="form-group">
             <label for="price">Цена:</label>
             <input type="number" value="0" min="0" class="form-control total" id="price">
         </div>
         <div class="form-group">
             <label for="count">Количество:</label>
             <input type="number" value="0" step="1" min="0" class="form-control total" id="count">
         </div>
         <div class="form-group">
             <label for="total">Сумма:</label>
             <input type="number" value="0" class="form-control" id="total" disabled>
         </div>
         <button type="submit" class="btn btn-primary button_sales">Продать</button>
         <a class="btn" role="button" href="/sales">Отмена</a>
     </div>
<script type="text/javascript" src="/js/salespage.js"></script>
</@a.basis>