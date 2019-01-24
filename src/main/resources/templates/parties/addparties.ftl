<#import "../page.ftl" as a>
<@a.basis>
<div class="container " style="margin-top: 30px">
    <h2>Добававить Контрагента</h2>
    <div class="form-group">
        <label for="name">Наименование:</label>
        <input type="text" class="form-control" name="name" id="name">
    </div>
    <div class="form-group">
        <label for="director">Директор:</label>
        <input type="text" class="form-control" name="director" id="director">
    </div>
    <div class="form-group">
        <label for="telephone">Телефон:</label>
        <input type="text" class="form-control" name="telephone" id="telephone">
    </div>
    <div class="form-group">
        <label for="address">Адрес:</label>
        <input type="text" class="form-control" name="address" id="address">
    </div>
    <button type="submit" class="btn btn-primary button_send_parties">Сохранить</button>
    <a class="btn" role="button" href="/counterparties">Отмена</a>
</div>
</@a.basis>