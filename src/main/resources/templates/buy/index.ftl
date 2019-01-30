<#import "../page.ftl" as a>
<@a.basis>
<div class="container " style="margin-top: 30px">
    <div class="clearfix">
        <span class="float-left"><h2>Список заказов</h2></span>
        <span class="float-right pr-5">
            <a class=" mt-1  btn btn-dark" href="/buy/add" role="button">Добавить закупку</a>
        </span>
    </div>
    <div class="float-sm-right"></div>
    <table class="table" style="text-align: center ;margin-top: 30px ">
        <thead>
        <tr>
            <th scope="col">Номер</th>
            <th scope="col">Дата</th>
            <th scope="col">Компонент</th>
            <th scope="col">Количество</th>
            <th scope="col">Цена</th>
            <th scope="col">Итого</th>
            <th scope="col">Действия</th>
        </tr>
        </thead>
    <#list buyList as buy>
                <tr>
                    <td>
                        <div class="mt-1">${buy.id}</div>
                    </td>
                    <td>
                        <div class="mt-1">${buy.date?date}</div>
                    </td>
                    <td>
                        <div class="mt-1">${buy.components.name}</div>
                    </td>
                    <td>
                        <div class="mt-1">${buy.count}</div>
                    </td>
                    <td>
                        <div class="mt-1">${buy.price}</div>
                    </td>
                    <td>
                        <div class="mt-1">${buy.total}</div>
                    </td>
                    <td>
                        <button type="button" class="btn btn-outline-light text-dark button_del_ordersid"
                                data-id="${buy.id}"><span class="oi oi-trash"></span></button>
                        </div>
                    </td>
                </tr>
    </#list>
    </table>
</div>
<script type="text/javascript" src="/js/buypage.js"></script>
</@a.basis>