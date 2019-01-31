<#import "../page.ftl" as a>
<@a.basis>
    <div class="container " style="margin-top: 30px">
        <div class="clearfix">
            <span class="float-left"><h2>Список продаж</h2></span>
            <span class="float-right pr-5">
            <a class=" mt-1  btn btn-dark" href="/sales/add" role="button">Добавить Продажу</a>
        </span>
        </div>
        <div class="float-sm-right"></div>
        <table class="table" style="text-align: center ;margin-top: 30px ">
            <thead>
            <tr>
                <th scope="col">Дата</th>
                <th scope="col">Продукт</th>
                <th scope="col">Количество</th>
                <th scope="col">Цена</th>
                <th scope="col">Итого</th>
                <th scope="col">Контрагент</th>
            </tr>
            </thead>
    <#list salesList as sales>
                <tr>
                    <td>
                        <div class="mt-1">${sales.date?date}</div>
                    </td>
                    <td>
                        <div class="mt-1">${sales.products.name}</div>
                    </td>
                    <td>
                        <div class="mt-1">${sales.count}</div>
                    </td>
                    <td>
                        <div class="mt-1">${sales.products.price}</div>
                    </td>
                    <td>
                        <div class="mt-1">${sales.total}</div>
                    </td>
                    <td>
                        <div class="mt-1">${sales.counterparties.name}</div>
                    </td>
                </tr>
    </#list>
        </table>
    </div>
<script type="text/javascript" src="/js/salespage.js"></script>
</@a.basis>