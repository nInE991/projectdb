<#import "../page.ftl" as a>
<@a.basis>
    <div class="container " style="margin-top: 30px">
        <div class="clearfix">
            <span class="float-left"><h2>Список Копонентов</h2></span>
            <span class="float-right pr-5">
            <a class=" mt-1  btn btn-dark" href="/orders/add" role="button">Добавить Компонент</a>
            <a class=" mt-1  btn btn-dark" href="/orders/add" role="button">Добавить Продажу</a>
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
        <#--<#list ordersList as orders>-->
            <tr class="trlink" date-link="">
                <td>
                    <div class="mt-1"></div>
                </td>
                <td>
                    <div class="mt-1"></div>
                </td>
            </tr>
        <#--</#list>-->
        </table>
    </div>
</@a.basis>
