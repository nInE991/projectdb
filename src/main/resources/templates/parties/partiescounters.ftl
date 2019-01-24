<#import "../page.ftl" as a>
<@a.basis>
   <div class="container " style="margin-top: 30px">
       <div class="clearfix">
           <span class="float-left"><h2>Контрагенты</h2></span>
           <span class="float-right pr-5"><a class=" mt-1  btn btn-dark" href="/counterparties/add" role="button">Добавить</a></span>
       </div>
       <div class="float-sm-right"></div>
       <table class="table" style="text-align: center ;margin-top: 30px ">
           <thead>
           <tr>
               <th scope="col">Наименование</th>
               <th scope="col">Директор</th>
               <th scope="col">Телефон</th>
               <th scope="col">Адрес</th>
               <th scope="col">Действия</th>
           </tr>
           </thead>
        <#list counterpartiesList as counterparties>
            <tr>
                <td>
                    <div class="mt-1">${counterparties.name}</div>
                </td>
                <td>
                    <div class="mt-1">${counterparties.directior}</div>
                </td>
                <td>
                    <div class="mt-1">${counterparties.telephone}</div>
                </td>
                <td>
                    <div class="mt-1">${counterparties.address}</div>
                </td>
                <td>
                    <div class="btn-group">
                        <button type="button" class="btn btn-outline-light text-dark button_edit"
                                date-id="${counterparties.id}"><span
                                class="oi oi-pencil"></span></button>
                        <button type="button" class="btn btn-outline-light text-dark button_del"
                                date-id="${counterparties.id}"><span
                                class="oi oi-trash"></span></button>
                    </div>
                </td>
            </tr>
        </#list>
       </table>
   </div>
</@a.basis>


