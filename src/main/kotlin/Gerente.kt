open class Gerente(
    var gerenciarSaldo: String,
    var contato: String,

    criarConta: String,
    gerenciarConta:String,
    cpf: String,
    saldo: String,
    numeroAgencia: String,
    nome: String,
    documento: String,
    sacar: String

) : Cliente(
    criarConta = criarConta,
    gerenciarConta = gerenciarConta,
    cpf = cpf,
    saldo = saldo,
    numeroAgencia = numeroAgencia,
    nome = nome,
    documento = documento,
    sacar = sacar
) {

}