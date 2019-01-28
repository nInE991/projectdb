<#import "../page.ftl" as a>
<@a.basis>
<div class="container " style="margin-top: 30px">
    <div class="clearfix">
        <span class="float-left"><h2>${component.name}</h2></span>
    <#--<span class="float-right pr-5">-->
    <#--<a class=" mt-1  btn btn-dark" href="/orders/add" role="button">Инвентаризация</a>-->
    <#--</span>-->
    </div>
    <div class="float-sm-right"></div>
    <table class="table" style="text-align: center ;margin-top: 30px ">
        <thead>
        <tr>
            <th scope="col">Дата</th>
            <th scope="col">Тип</th>
            <th scope="col">Количество</th>
            <th scope="col">Заметки</th>
        </tr>
        </thead>
        <#list logsList as logs>
            <tr date-link="${logs.id}">
                <td>
                    <div class="mt-1">${logs.date?date}</div>
                </td>
                <td>
                    <div class="mt-1">${logs.actions.action}</div>
                </td>
                <td>
                    <div class="mt-1">${logs.count}</div>
                </td>
                <td>
                    <div class="mt-1">${logs.note}</div>
                </td>
            </tr>
        </#list>
    </table>
</div>
</@a.basis>