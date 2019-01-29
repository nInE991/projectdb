<#import "../page.ftl" as a>
<@a.basis>
      <div class="container " style="margin-top: 30px">
          <h2>Продукция</h2>
          <div class="form-group">
              <label for="name">Название:</label>
              <input type="text" class="form-control" id="name" name="name" value="${name!""}">
          </div>
          <div class="form-group">
              <label for="price">Цена:</label>
              <input type="number" value="${price!0.0}" step="0.1" class="form-control" id="price" name="price">
          </div>
          <button type="submit" class="btn btn btn-dark mt-2 button_add_products" data-id="${id!0}">Добавить</button>
          <a class="btn btn btn-dark mt-2" role="button" href="/products">Отмена</a>
      </div>
   <script type="text/javascript" src="/js/productspage.js"></script>
</@a.basis>
