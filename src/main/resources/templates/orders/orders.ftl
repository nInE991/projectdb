<#import "../page.ftl" as a>
<@a.basis>
<div class="container " style="margin-top: 30px">
    <div class="clearfix">
        <span class="float-left"><h2>Список заказов</h2></span>
        <span class="float-right pr-5">
            <a class=" mt-1  btn btn-dark" href="/orders/add" role="button">Добавить Покупку</a>
            <a class=" mt-1  btn btn-dark" href="/orders/add" role="button">Добавить Продажу</a>
        </span>
    </div>
    <div class="float-sm-right"></div>
    <table class="table" style="text-align: center ;margin-top: 30px ">
        <thead>
        <tr>
            <th scope="col">Номер</th>
            <th scope="col">Дата</th>
            <th scope="col">Тип</th>
            <th scope="col">Контрагент</th>
            <th scope="col">Сумма</th>
            <th scope="col">Заметки</th>
        </tr>
        </thead>
 <#list ordersList as orders>
            <tr class="trlink" date-link=${orders.id}>
                <td>
                    <div class="mt-1">${orders.id}</div>
                </td>
                <td>
                    <div class="mt-1">${orders.date}</div>
                </td>
                <td>
                    <div class="mt-1">${orders.ordersActions.action}</div>
                </td>
                <td>
                    <div class="mt-1">${orders.counterparties.name}</div>
                </td>
                <td>
                    <div class="mt-1">${orders.total}</div>
                </td>
                <td>
                    <div class="mt-1">${orders.note}</div>
                </td>
            </tr>
 </#list>
    </table>
</div>
</@a.basis>
