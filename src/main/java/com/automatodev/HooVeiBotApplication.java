package com.automatodev;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HooVeiBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(HooVeiBotApplication.class, args);
	}
	
	@Bean
	public DiscordApi discordApi(){

		String token = "ODk3MTY3ODU5MDc0MDcyNTc2.YWRurg.TQhZDqjGdUKZzSbF-P-mLStV1DY";

		DiscordApi api = new DiscordApiBuilder().setToken(token)
		.setAllNonPrivilegedIntents()
		.login()
		.join();

		api.addMessageCreateListener(event ->{

			String mensagem = "";

			if(event.getMessageContent().equals(".eae_zoio")){

				mensagem = "E ae...Salve! "+event.getMessageAuthor().getName()+" !Firmeza?";
				event.getChannel().sendMessage(mensagem);

			}else if(event.getMessageContent().equals(".flws_zoio")){

				mensagem = "E ae....João...Lobinhoo..Hugo...Hó o Marcão ae... firmeza irmão .....Hugo.... Satisfação aí...Vamo que vamo....pro corre... abraço... aí fica firme...."+
				"\nJoão... Satisfação aí continua assim estudando... Trabalhando...Fazendo os corre mano....Vlw aí rapaziada...flwss.vlwss....flwss";
				event.getChannel().sendMessage(mensagem);

			}else if(event.getMessageContent().equals(".bão_zoio")){

				mensagem = "..Senhores..Xitersss";
				event.getChannel().sendMessage(mensagem);

			}else if(event.getMessageContent().equals(".hugo_pistola")){

				mensagem = "HOOOO VEI...SE TAZOANDO MANO....SE NEM CONHECE O MENINO VEI... SE NÃO TEM INTIMIDADE COM ELE... PORRA HUGOO! ";
				event.getChannel().sendMessage(mensagem);

			}else if(event.getMessageContent().equals(".marcao_cnh")){

				mensagem = "TA DIZENDO.. QUE SE TU TENDO CARTEIRA TU NÃO ULTRAPASSA VEI!!... SE TA DEVENDO PA JUSTIÇA MANO?.... PORRA MARCAO AI NÃO IRMÃO";
				event.getChannel().sendMessage(mensagem);
			}else if(event.getMessageContent().equals(".jao_roupa")){

				mensagem = "TEM QUE..LAVA ROUPA VEI!!....JA LAVOU A ROUPA MANO?";
				event.getChannel().sendMessage(mensagem);
			}

			UtilLog.getLog().info("Usuario: "+event.getMessageAuthor().getName()+"\nRecebido: "+event.getMessageContent()+"\nEnviado: "+mensagem);

		});
		
		return api;
	}

}
