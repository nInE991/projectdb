<#import "../page.ftl" as a>
<@a.basis>
<div class="container " style="margin-top: 30px">
    <h2>Изменить Контрагента</h2>
    <div class="form-group">
        <label for="name">Наименование:</label>
        <input type="text" class="form-control" name="name" value="${counterparties.name}" id="name">
    </div>
    <div class="form-group">
        <label for="director">Директор:</label>
        <input type="text" class="form-control" name="director" value="${counterparties.directior}" id="director">
    </div>
    <div class="form-group">
        <label for="telephone">Телефон:</label>
        <input type="text" class="form-control" name="telephone" value="${counterparties.telephone}" id="telephone">
    </div>
    <div class="form-group">
        <label for="address">Адрес:</label>
        <input type="text" class="form-control" name="address" value="${counterparties.address}" id="address">
    </div>
    <button type="submit" class="btn btn-primary button_edit_send_parties" data-id="${counterparties.id}">Сохранить</button>
    <a class="btn" role="button" href="/counterparties">Отмена</a>
</div>

</@a.basis>
