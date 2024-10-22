# Aula 01

## Ementa
Introdução aos sistemas corporativos. 
Plataformas para o desenvolvimento de sistemas corporativos. 
Servidores de aplicação e os componentes gerenciados por tais servidores. 
Detalhamento dos elementos de uma aplicação corporativa e 
os vários serviços que podem ser utilizados de um servidor de aplicação. 
Segurança e integridade de dados. Desenvolvimento utilizando frameworks de apoio.

### Objetivo
- Compreender os conceitos fundamentais de embasam o desenvolvimento de sistemas corporativos;
- Utilizar uma plataforma de desenvolvimento de aplicações corporativas;
- Construir uns sistemas corporativos com todas as características necessárias.

## Introdução aos Sistemas Corporativos

### Contexto (Complexidade)

 - Desenvolver uma solução de software para qualquer problema real é uma atividade **complexa** que exige habilidades e empenho.
   
> "The most fundamental problem in software development is complexity. There is only one basic way of dealing with complexity: divide and conquer". Bjarne Stroustrup

> … menos de 15% dos projetos em cascata e mais de 40% das iniciativas ágeis foram concluídos com sucesso. (*CHAOS Report 2020*)

 - Por que utilizar programação orientada a objeto ?  
 - Por que estruturar o seu código, pensar em arquitetura de software ?  
 - Por que a linguagem de programação JAVA / PHP ?  
 - Quantas instâncias são necessárias para a sua solução e por quê ?  
 - Quais práticas de desenvolvimento vocês estão utilizando e por quê ?  
 - Discrimine como as ferramentas e práticas deixaram o desenvolvimento mais eficiente e eficaz ?  
 - Como a qualidade do produto está sendo gerenciada (monitorada) ?  

### O que é Desenvolvimento de Software Corporativo ?

As **tomadas de decisões** corporativas são motivada pela concorrência global ou por uma estabilidade política e social, 
pois as organizações são constantemente pressionadas a responder prontamente aos avanços tecnológicos 
a fim de impor uma vantagem competitiva ou responder a uma necessidade emergente.  

Atualmente, 
nessa busca por uma **vantagem competitiva**, 
o desenvolvimento de software torna-se crucial 
por referir-se à prática de criar e 
manter sistemas de software personalizados 
para atender às necessidades específicas de uma organização ou empresa 
com o intuito de **facilitar** e **otimizar** os processos internos, 
**melhorar a eficiência operacional** e fornecer **suporte (alinhados)** às atividades de negócios.   

### Principais Características

**Personalização**: Os sistemas corporativos são desenvolvidos para atender às necessidades exclusivas de uma organização. 
Eles podem ser adaptados para lidar com processos de negócios específicos, requisitos regulatórios e outras demandas exclusivas.  
**Integração**: Os sistemas corporativos geralmente precisam se integrar a outras soluções de software já em uso pela empresa. 
Isso pode envolver integração com sistemas legados, bancos de dados existentes, aplicativos de terceiros, entre outros.  
**Escalabilidade**: Os sistemas devem ser escaláveis para acompanhar o crescimento da empresa. 
Isso significa que eles devem ser capazes de lidar com um aumento no volume de dados, usuários e transações sem comprometer o desempenho.  
**Segurança**: A segurança da informação é uma consideração crucial no desenvolvimento de sistemas corporativos. 
É essencial proteger os dados sensíveis da empresa contra acessos não autorizados e garantir a integridade e confidencialidade das informações.  
**Manutenção e Suporte Contínuo**: Após o desenvolvimento inicial, os sistemas corporativos exigem manutenção regular para corrigir bugs, 
implementar melhorias e garantir a conformidade contínua com os requisitos do negócio.  
**Colaboração**: Muitas empresas utilizam sistemas corporativos para facilitar a colaboração entre equipes e departamentos. 
Isso pode envolver a implementação de funcionalidades como compartilhamento de documentos, comunicação integrada e fluxos de trabalho automatizados.  
**Tecnologias Utilizadas**: O desenvolvimento de sistemas corporativos pode envolver uma variedade de tecnologias, incluindo linguagens de programação, 
bancos de dados, frameworks e ferramentas específicas para o desenvolvimento web, mobile ou integração de sistemas.  

### Atividade Prática
 
**1. Definir o Processo de Desenvolvimento**:   

Um **Processo de Desenvolvimento de Software** define uma sequência de atividades que guiam o desenvolvimento de software desde o planejamento até a entrega e manutenção. 
No contexto corporativo, essas atividades são padronizadas para garantir que o software seja:  
 
 - **Escalável**: Suportando o crescimento da empresa e os novos requisitos do negócio.
 - **Seguro**: Protegendo dados sensíveis e garantindo a conformidade com regulações.
 - **Manutenível**: Permitindo atualizações e correções com impacto mínimo no sistema.
 - **Colaborativo**: Facilitando a interação entre diferentes equipes e stakeholders.

**2. Definir uma Plataforma de Controle de Versão e Colaboração de Código**: 

 - Gerenciar o histórico de código e acompanhar todas as modificações feitas.
 - Colaborar em equipe, permitindo que várias pessoas trabalhem no mesmo projeto, resolvendo conflitos de código.
 - Automatizar fluxos de trabalho, como testes automatizados, deploys, revisões de código, entre outros.
 - Armazenar e versionar código de forma centralizada, acessível de qualquer lugar.  


### Atividade Resolvida

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

3. **Redução de Riscos** : O desenvolvimento incremental ajuda a mitigar riscos, pois cada parte do sistema é desenvolvida, testada e validada isoladamente antes de ser integrada ao todo.
Isso facilita a identificação precoce de problemas e permite que correções sejam feitas de maneira mais eficiente. A abordagem iterativa promove feedback contínuo de usuários e stakeholders,
o que diminui o risco de falhas ou mal-entendidos sobre os requisitos do sistema.

4. **Entregas Parciais e Valor Contínuo** : Com o modelo iterativo e incremental, o sistema pode ser liberado em módulos funcionais antes da conclusão total.
Por exemplo, o módulo de gerenciamento de pacientes pode ser entregue enquanto outros módulos, como o de faturamento, ainda estão em desenvolvimento. Isso permite que o **FPenha Corporation** e
os profissionais do hospital comecem a se beneficiar do sistema mais cedo, ao mesmo tempo que colaboram ativamente para o aprimoramento das funcionalidades que estão por vir.

![image](https://github.com/user-attachments/assets/219e8a3d-2cb3-4914-85ad-a798849bdac1)


####  O DONO DO PRODUTO {ANALISA} A SOLICITAÇÃO  

1. CASO O **ESCOPO** NÃO TENHA SIDO DEFINIDO, DEFINA  
2. VERIFIQUE SE O **ESCOPO** DEFINIDO COMPREENDE O DEMANDADO  
	2.1 CASO O **ESCOPO** ESTEJA CONFLITANDO COM O DEMANDADO  
		2.2.1 VERIFICA A VIABILIDADE TÉCNICA E ORÇAMENTÁRIA  
			2.2.1.1 CASO SEJA VIÁVEL, REFINA O **ESCOPO**  
			2.2.1.2 CASO NÃO, ELABORE UM **RELATÓRIO DE INVIABILIDADE**  
		2.2.2 ESTABELEÇA **O(S) ARTEFATO(S) DE REQUISITOS** PARA A DEMANDA   

#### O DONO DO PRODUTO [TESTADOR, DESENVOLVEDOR] {ESPECIFICA} O QUE REALIZAR  

1. PARA CADA **ARTEFATO DE REQUISITOS** QUE COMPREENDA A SOLICITAÇÃO, FAÇA  
  1.1 CRIE **TAREFA**(S) PARA DETALHAR O **ARTEFATO DE REQUISITOS**  
	1.2 PARA CADA TAREFA CRIADA, FAÇA  
		1.2.1 ASSOCIE O **ARTEFATO DE REQUISITOS** COM A(S) **TAREFA**(S)  
		1.2.2 ESTABELEÇA CRITÉRIOS DE ACEITAÇÃO  
		1.2.3 DEFINA A COMPLEXIDADE, IMPACTO NO NEGÓCIO E DATA DE ENTREGA  
		1.2.4 SE O **ARTEFATO DE REQUISITO** E **OS CRITÉRIOS DE ACEITE**   
					            ESTIVEREM SUFICIENTE PARA INICIAR O DESENVOLVIMENTO, FAÇA  
			1.2.4.1 ALTERE O STATUS DA **TAREFA** PARA *PRONTA*.  
  1.3 REVISE E REFINA O **ARTEFATO DE REQUISITOS** EM QUESTÃO  
