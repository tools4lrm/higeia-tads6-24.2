**O que é Processo ?** 

![image](https://github.com/user-attachments/assets/c31a7632-5f74-4282-a38d-1b265bf6cf75)

O Processo que será utilizado para o desenvolvimento do Sistema Hospitalar ( Higeia ), solicitado pela **FPenha Corporation**, 
foi instanciado pela mescla dos seguintes modelos modelos de ciclo de vida de software: **iterativo** e **incremental**. 
Essa escolha (**tomada de decisão**) foi motivada pelos seguintes aspectos : 

1. **Complexidade e Escopo Progressivo** : O sistema hospitalar abrange diversas funcionalidades críticas, como gestão de pacientes, prontuários,
administração de medicamentos, e faturamento. O modelo iterativo e incremental permite que o sistema seja construído por partes,
focando primeiramente em funcionalidades essenciais e, em ciclos subsequentes, incrementando com novas características.
Isso possibilita uma validação contínua com os stakeholders (as partes interessadas), permitindo ajustes conforme o sistema evolui.  

2. **Flexibilidade para Mudanças** : Em sistemas hospitalares, os requisitos podem mudar à medida que novos regulamentos de saúde surgem ou
que os profissionais percebam novas necessidades operacionais. O processo iterativo possibilita acomodar essas mudanças, já que **cada
iteração oferece a oportunidade de reavaliar e ajustar o escopo**. O processo incremental permite que novas funcionalidades sejam adicionadas
sem comprometer a integridade do sistema previamente desenvolvido, promovendo uma evolução controlada.  

3. **Redução de Riscos** : O desenvolvimento incremental ajuda a mitigar riscos, pois cada parte do sistema é desenvolvida, testada e
validada isoladamente antes de ser integrada ao todo. Isso facilita a identificação precoce de problemas e permite que correções
sejam feitas de maneira mais eficiente. A abordagem iterativa promove feedback contínuo de usuários e stakeholders, o que diminui
o risco de falhas ou mal-entendidos sobre os requisitos do sistema.

5. **Entregas Parciais e Valor Contínuo** : Com o modelo iterativo e incremental, o sistema pode ser liberado em módulos funcionais antes da conclusão total.
Por exemplo, o módulo de gerenciamento de pacientes pode ser entregue enquanto outros módulos, como o de faturamento, ainda estão em desenvolvimento. Isso permite que o **FPenha Corporation** e
os profissionais do hospital comecem a se beneficiar do sistema mais cedo, ao mesmo tempo que colaboram ativamente para o aprimoramento das funcionalidades que estão por vir.

![image](https://github.com/user-attachments/assets/219e8a3d-2cb3-4914-85ad-a798849bdac1)


####  O DONO DO PRODUTO {ANALISA} A SOLICITAÇÃO  

1. DEFINA O **ESCOPO**, CASO AINDA NÃO TENHA SIDO DEFINIDO   
2. VERIFIQUE SE O **ESCOPO** DEFINIDO COMPREENDE O DEMANDADO
3. CASO O **ESCOPO** ESTEJA CONFLITANDO COM O DEMANDADO   
	1. CASO SEJA VIÁVEL, REFINA O **ESCOPO**  
	2. CASO NÃO, ELABORE UM **RELATÓRIO DE INVIABILIDADE**  
4. CASO CONTRÁRIO, ESTABELEÇA **O(S) ARTEFATO(S) DE REQUISITOS** PARA A DEMANDA
	1. PARA CADA **ARTEFATO DE REQUISITOS** QUE COMPREENDA A SOLICITAÇÃO, FAÇA  
		1. CRIE **TAREFA**(S) PARA INICIAR A ESPECIFICAÇÃO DO QUE FAZER COM *STATUS INDEFINIDA*
 		2. ASSOCIE A(S) **TAREFA**(S) RECÉM CRIADA COM O **ARTEFATO DE REQUISITOS**

#### O DONO DO PRODUTO [, TESTADOR,  DESENVOLVEDOR] {ESPECIFICA} O QUE REALIZAR  

1. ENQUANTO TIVER **TAREFA** COM *STATUS INDEFINIDA*, FAÇA
	1. SE NECESSÁRIO, REFINA A **TAREFA** E O **ARTEFATO DE REQUISITOS** ASSOCIADO
	2. ESTABELEÇA CRITÉRIOS DE ACEITAÇÃO  
	3. CASO A **TAREFA** E **OS CRITÉRIOS DE ACEITE**   
				ESTIVEREM SUFICIENTE PARA O DESENVOLVIMENTO, FAÇA  
			1. ALTERE O *STATUS* DA **TAREFA** PARA *PRONTA*.  
  	
#### O DONO DO PRODUTO [, TESTADOR, DESENVOLVEDOR] {PLANEJA} O ENTREGARÁ  

1. ENQUANTO TIVER **TAREFA** COM *STATUS PRONTA*, DEFINA    
	1. O IMPACTO NO NEGÓCIO E A COMPLEXIDADE  
 	2. INDIQUE A ITERAÇÃO SERÁ REALIZADA   
 	3. ALTERE O *STATUS* DA **TAREFA** PARA *PLANEJADA*.  

#### O DESENVOLVEDOR {CODIFICA} A TAREFA

1. CASO NÃO TENHA **TAREFA** ATRIBUÍDA COM *STATUS EM DESENVOLVIMENTO*   
	1. ESCOLHA UMA **TAREFA** COM *STATUS* DE *PLANEJADA* E DE *MAIOR PRIORIDADE*
	2. ALTERE O *STATUS* DA **TAREFA** PARA *EM DESENVOLVIMENTO*
2. ENQUANTO O *STATUS* DA **TAREFA** FOR *EM DESENVOLVIMENTO*, FAÇA.  
	1. ANALISE A **TAREFA**
        2. CASO TENHA, DETALHE DÚVIDA/DIFICULDADE NA **TAREFA**
	3. ALTERE OS ARTEFATOS DE CÓDIGO NECESSÁRIOS 
	4. ASSOCIE AS ALTERAÇÕES COM A **TAREFA** EM QUESTÃO
 	5. CASO A IMPLEMENTAÇÃO ESTEJA SATISFATÓRIA
     		1. ALTERE O *STATUS* DA **TAREFA** PARA *REALIZADA*.

#### O TESTADOR [DONO DO PRODUTO, DESENVOLVEDOR] {REVISA} O REALIZADO

1. PARA CADA **TAREFA** COM *STATUS* DE *REALIZADA* 
	1. ANALISE OS COMENTÁRIOS REGISTRADO NA **TAREFA** DURANTE O PERÍODO DE REALIZAÇÃO
 	2. CASO NECESSÁRIO, COM OS COMENTÁRIOS/DÚVIDAS REGISTRADOS, REFINA O **ARTEFATO DE REQUISITO** ASSOCIADO A **TAREFA**   
 	3. AVALIE O **PRODUTO** ENTREGUE COM OS CRITÉRIOS DE ACEITE DEFINIDOS NO **ARTEFATO DE REQUISITO**  ASSOCIADO A **TAREFA**   
  	4. CASO O **CRITÉRIO DE ACEITE** ESTEJA SUFICIENTE, COMPATÍVEL COM O REALIZADO  
   		1. ALTERE STATUS DA TAREFA PARA FEITA  	  
 	6. CASO NÃO, O **CRITÉRIO DE ACEITE** ESTEJA INSUFICIENTE  
		1. ADICIONE OU REFINA OS CRITÉRIOS DE ACEITE DO **ARTEFATO DE REQUISITOS**  
  		2. ALTERE O *STATUS* DA **TAREFA** PARA *PLANEJADA* 
