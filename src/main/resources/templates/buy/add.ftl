<#import "../page.ftl" as a>
<@a.basis>
     <div class="container " style="margin-top: 30px">
         <h2>Закупка</h2>
         <div class="form-group">
             <label for="name">Компонент:</label>
             <select type="text" class="form-control comp" id="name">
                <#list componentsList as components>
                    <option value="${components.id}">${components.name}</option>
                </#list>
             </select>
         </div>
         <div class="form-group">
             <label for="date">Дата:</label>
             <input type="date" class="form-control" name="date" id="date">
         </div>
         <div class="form-group">
             <label for="price">Цена:</label>
             <input type="number" value="0" step="0.1" min="0" class="form-control total" id="price">
         </div>
         <div class="form-group">
             <label for="count">Количество:</label>
             <input type="number" value="0" step="0.1" min="0" class="form-control total" id="count">
         </div>
         <div class="form-group">
             <label for="total">Сумма:</label>
             <input type="number" value="0" step="0.1" class="form-control" id="total" disabled>
         </div>
         <button type="submit" class="btn btn-primary button_buy">Купить</button>
         <a class="btn" role="button" href="/buy">Отмена</a>
     </div>
<script type="text/javascript" src="/js/buypage.js"></script>
</@a.basis>