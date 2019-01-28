<#import "../page.ftl" as a>
<@a.basis>
     <div class="container " style="margin-top: 30px">
         <div class="clearfix">
             <span class="float-left"><h2>Продукция</h2></span>
             <span class="float-right pr-5"><a class=" mt-1  btn btn-dark" href="/products/add"
                                               role="button">Добавить</a></span>
         </div>
         <div class="float-sm-right"></div>
         <table class="table" style="text-align: center ;margin-top: 30px ">
             <thead>
             <tr>
                 <th scope="col">Наименование</th>
                 <th scope="col">Цена</th>
                 <th scope="col">Действия</th>
             </tr>
             </thead>
        <#list productsList as products>
            <tr>
                <td>
                    <div class="mt-1">${products.name}</div>
                </td>
                <td>
                    <div class="mt-1">${products.price}</div>
                </td>
                <td>
                    <div class="btn-group">
                        <button type="button" class="btn btn-outline-light text-dark"
                                data-id="${products.id}"><span class="oi oi-pencil"></span></button>
                        <button type="button" class="btn btn-outline-light text-dark"
                                data-id="${products.id}"><span
                                class="oi oi-trash"></span></button>
                    </div>
                </td>
            </tr>
        </#list>
         </table>
     </div>
</@a.basis>