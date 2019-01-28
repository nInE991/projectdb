<#import "../page.ftl" as a>
<@a.basis>
    <div class="container " style="margin-top: 30px">
        <div class="clearfix">
            <span class="float-left"><h2>Склад</h2></span>
            <span class="float-right pr-5">
            <a class=" mt-1  btn btn-dark" href="/logs/add" role="button">Инвентаризация</a>
        </span>
        </div>
        <div class="float-sm-right"></div>
        <table class="table" style="text-align: center ;margin-top: 30px ">
            <thead>
            <tr>
                <th scope="col">Название</th>
                <th scope="col">Остаток</th>
                <th scope="col">Ед. Измерения</th>
            </tr>
            </thead>
        <#list logsList as components>
            <tr class="trlinklog" data-id="${components.id}">
                <td>
                    <div class="mt-1">${components.name}</div>
                </td>
                <td>
                    <div class="mt-1">${components.componentBalance.balance}</div>
                </td>
                <td>
                    <div class="mt-1">${components.units.name}</div>
                </td>
            </tr>
        </#list>
        </table>
    </div>
</@a.basis>
