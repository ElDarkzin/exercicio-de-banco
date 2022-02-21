class Pessoa(
    var verLimite: String,

    gerenciarSaldo: String,
    contato: String,
    criarConta: String,
    gerenciarConta:String,
    cpf: String,
    saldo: String,
    numeroAgencia: String,
    nome: String,
    documento: String,
    sacar: String

) : Gerente(
    gerenciarSaldo = gerenciarSaldo,
    contato = contato,
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
