<#import "../page.ftl" as a>
<@a.basis>
<div class="container " style="margin-top: 30px">
    <h2>Инвентаризация</h2>
    <div class="form-group">
        <label for="name">Наименование:</label>
        <select type="text" class="form-control namecomp" name="name">
        <#list componentList as components>
            <option value="${components.id}">${components.name}</option>
        </#list>
        </select>
    </div>
    <div class="form-group">
        <label for="count">Количество:</label>
        <input type="number" value="0" step="0.01" class="form-control" name="count" id="count">
    </div>
    <div class="form-group">
        <label for="note">Заметки:</label>
        <input type="text" class="form-control" name="note" id="note">
    </div>
    <button type="submit" class="btn btn-primary button_add_logs">Сохранить</button>
    <a class="btn" role="button" href="/logs">Отмена</a>
</div>
 <script type="text/javascript" src="/js/logspage.js"></script>
</@a.basis>