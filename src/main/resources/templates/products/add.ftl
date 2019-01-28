<#import "../page.ftl" as a>
<@a.basis>
      <div class="container " style="margin-top: 30px">
          <h2>Добавить Продукцию</h2>
          <div class="clearfix">
              <span class="float-left mt-2">
                  <div class="form-inline">
                      <label for="name">Название:</label>
                      <input class="form-control ml-2" type="text" id="name">
                      <label for="price" class="ml-2">Цена:</label>
                      <input class="form-control ml-2" type="number" id="price">
                  </div>
              </span>
              <span class="float-right pr-5">
                    <button class="btn btn-dark mt-2">Добавить компонент</button>
                    <button type="submit" class="btn btn btn-dark mt-2 button_add_products">Сохранить</button>
                    <a class="btn btn btn-dark mt-2" role="button" href="/products">Отмена</a>
              </span>
          </div>
          <div>
              <table class="table" style="text-align: center ;margin-top: 30px ">
                  <thead>
                  <tr>
                      <th scope="col">Наименование</th>
                      <th scope="col">Количество</th>
                      <th scope="col">Ед. Измерения</th>
                      <th scope="col">Действия</th>
                  </tr>
                  </thead>
          </div>
          <script type="text/javascript" src="/js/productspage.js"></script>
</@a.basis>