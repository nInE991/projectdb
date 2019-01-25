<#import "../page.ftl" as a>
<@a.basis>
    <div class="container " style="margin-top: 30px">
        <h2>Добававить Компонент</h2>
        <div class="form-group">
            <label for="name">Наименование:</label>
            <input type="text" class="form-control" name="name" id="name">
        </div>
        <div class="form-group">
            <label for="units">Ед. Измерения:</label>
            <select type="text" class="form-control units" name="units" >
                <#list unitsList as units>
                    <option value="${units.id}">${units.name}</option>
                </#list>
            </select>
        </div>
        <button type="submit" class="btn btn-primary button_add_components">Сохранить</button>
        <a class="btn" role="button" href="/components">Отмена</a>
    </div>
</@a.basis>