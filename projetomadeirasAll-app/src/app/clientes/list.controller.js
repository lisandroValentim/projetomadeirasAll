import swal from 'sweetalert2'

export default class ListController {

    constructor(ClienteServico, Notification) {
        this.filterField = 'nome'
        this.filterValue = ''
        this.order = 'nome'
        this.records = []
        this._service = ClienteServico
        this._notify = Notification
        this.formatCpfCnpj()
        this.load()
    }

    load() {
        this._service.findAll(this.filterField, this.filterValue, this.order)
          .then(data => {
              this.records = data
          })
          .catch(error => {
              console.log(error)
          })
    }

   formatCpfCnpj(value) {
    switch (value && value.length) {
        case 11:
          return value.replace(/(\d{3})(\d{3})(\d{3})(\d{2})/, '$1.$2.$3-$4')
        case 14:
          return value.replace(/(\d{2})(\d{3})(\d{3})(\d{4})(\d{2})/, '$1.$2.$3/$4-$5')
        default:
          return value;
      }
    }   

    excluir(id) {
        swal({
            title: 'Remover registro',
            text: 'Deseja realmente remover o registro',
            type: 'warning',
            showConfirmButton: true,
            showCancelButton: true,
            confirmButtonText: 'Claro!',
            cancelButtonText: 'Não obrigado'
        }).then(resp => {
            return resp.value ? 
              this._service.remove(id) :
              Promise.reject({type: 'warning', message: 'Operação cancelada!!!'})
        }).then(response => {
            this.load()
            this._notify.success('Registro excluído com sucesso')
        }).catch(erro => {
            this._notify({message: erro.message || 'Problemas ao excluir o registro'}, erro.type || 'error')
        }) 
    }
}

ListController.$inject = ['ClienteServico', 'Notification']
