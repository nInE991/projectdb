<#import "../page.ftl" as a>
<@a.basis>
      <div class="container " style="margin-top: 30px">
          <h2>${name}</h2>
          <div class="clearfix">
              <span class="float-left mt-2">
                <h5 class="mt-2">Компоненты:</h5>
              </span>
              <span class="float-right pr-5">
                    <button class="btn btn-dark mt-2 button_add_comp">Добавить компонент</button>
              </span>
          </div>

          <table class="table" style="text-align: center ;margin-top: 30px ">
              <thead>
              <tr>
                  <th scope="col">Наименование</th>
                  <th scope="col">Количество</th>
                  <th scope="col">Ед. Измерения</th>
                  <th scope="col">Действия</th>
              </tr>
              </thead>
                 <#list productStructuresList as productStructures>
                        <tr>
                            <td>
                                <div class="mt-2">${productStructures.components.name}</div>
                            </td>
                            <td>
                                <div class="mt-2">${productStructures.count}</div>
                            </td>
                            <td>
                                <div class="mt-2">${productStructures.components.units.name}</div>
                            </td>
                            <td>
                                <div class="btn-group">
                                    <button type="button" class="btn btn-outline-light text-dark"
                                            data-id="${productStructures.id}"><span class="oi oi-pencil"></span>
                                    </button>
                                    <button type="button" class="btn btn-outline-light text-dark but_delete_prodstruct"
                                            data-id="${productStructures.id}"><span
                                            class="oi oi-trash"></span></button>
                                </div>
                            </td>
                        </tr>
                 </#list>
          </table>
          <div class="modal fade" id="Modal">
              <div class="modal-dialog modal-dialog-centered">
                  <div class="modal-content">
                      <!-- Modal Header -->
                      <div class="modal-header">
                          <h4 class="modal-title" id="modal_id">Добавить компонент</h4>
                          <button type="button" class="close" data-dismiss="modal">&times;</button>
                      </div>

                      <!-- Modal body -->
                      <div class="modal-body" style="text-align:left">
                          <div class="row" id="row1">
                              <div class="col-3 m-2"><strong><h6>Наименование</h6></strong></div>
                              <div class="col">
                                  <select type="text" class="form-control compname" name="compname">
                                      <#list compList as components>
                                          <option value="${components.id}">${components.name}</option>
                                      </#list>
                                  </select></div>
                          </div>
                          <div class="row" id="row3">
                              <div class="col-3 m-2"><strong><h6>Количество</h6></strong></div>
                              <div class="col"><input type="number" class="form-control" id="editCount"></div>
                          </div>
                      </div>
                      <div class="modal-footer">
                          <button type="button" data-type="edit" class="btn btn-secondary btn-modal" id="buttonModal"
                                  data-id="${id}">
                              Добавить
                          </button>
                          <button type="button" class="btn btn-danger" data-dismiss="modal">Закрыть</button>
                      </div>
                  </div>
              </div>
          </div>
      </div>
 <script type="text/javascript" src="/js/productspage.js"></script>
</@a.basis>