<#import "../page.ftl" as a>
<@a.basis>
     <div class="container " style="margin-top: 30px">
         <div class="clearfix">
             <span class="float-left"><h2>Компоненты</h2></span>
             <span class="float-right pr-5"><a class=" mt-1  btn btn-dark" href="/components/add" role="button">Добавить</a></span>
         </div>
         <div class="float-sm-right"></div>
         <table class="table" style="text-align: center ;margin-top: 30px ">
             <thead>
             <tr>
                 <th scope="col">Наименование</th>
                 <th scope="col">Ед. Измерения</th>
                 <th scope="col">Действия</th>
             </tr>
             </thead>
        <#list componentsList as components>
            <tr>
                <td>
                    <div class="mt-1">${components.name}</div>
                </td>
                <td>
                    <div class="mt-1">${components.units.name}</div>
                </td>
                <td>
                    <div class="btn-group">
                        <button type="button" class="btn btn-outline-light text-dark button_edit_components"
                                data-id="${components.id}"><span class="oi oi-pencil"></span></button>
                        <button type="button" class="btn btn-outline-light text-dark button_del_components"
                                data-id="${components.id}"><span
                                class="oi oi-trash"></span></button>
                    </div>
                </td>
            </tr>
        </#list>
         </table>
     </div>
</@a.basis>