package com.example.database


object Contacts {

    fun getAllBirds(): List<Birds> {
        return listOf(
            Birds(
                id = 1,
                "Ronaldo",
                "https://i0.wp.com/eurofootballrumours.com/wp-content/uploads/2021/09/Manchester-United-Players-Salaries-2122.jpeg?fit=800%2C445&ssl=1",
                "7",
                "Manchester Yunayted",
                " Ronaldo began his senior career with Sporting CP, before signing with Manchester United in 2003, aged 18, winning the FA Cup in his first season. He would also go on to win three consecutive Premier League titles, the Champions League and the FIFA Club World Cup; at age 23, he won his first Ballon d'Or. Ronaldo was the subject of the then-most expensive association football transfer when he signed for Real Madrid in 2009 in a transfer worth €94 million (£80 million), where he won 15 trophies, including two La Liga titles, two Copa del Rey, and four Champions Leagues, and became the club's all-time top goalscorer. He won back-to-back Ballons d'Or in 2013 and 2014, and again in 2016 and 2017, and was runner-up three times behind Lionel Messi, his perceived career rival. In 2018, he signed for Juventus in a transfer worth an initial €100 million (£88 million), the most expensive transfer for an Italian club and for a play"
            ),
            Birds(
                id = 2,
                "Messi",
                "https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2021/10/19/16346783870037.jpg",
                "30",
                "PSG",
                "Born and raised in central Argentina, Messi relocated to Spain to join Barcelona at the age of 13, for whom he made his competitive debut aged 17 in October 2004. He established himself as an integral player for the club within the next three years, and in his first uninterrupted season in 2008–09 he helped Barcelona achieve the first treble in Spanish football; that year, aged 22, Messi won his first Ballon d'Or. Three successful seasons followed, with Messi winning four consecutive Ballons d'Or, making him the first player to win the award four times and in a row. During the 2011–12 season, he set the La Liga and European records for most goals scored in a single season, while establishing himself as Barcelona's all-time top scorer. The following two seasons, Messi finished second for the Ballon d'Or behind Cristiano Ronaldo (his perceived career rival), before regaining his best form during the 2014–15 campaign, becoming the all-time top scorer in La Liga and leading Barcelona to a historic second treble, after which he was awarded a fifth Ballon d'Or in 2015. Messi assumed captaincy of Barcelona in 2018, and in 2019 he won a record sixth Ballon d'Or. Out of contract, he signed for Paris Saint-Germain in August 2021."
            ),
            Birds(
                id = 3,
                "Neymar",
                "https://i.pinimg.com/736x/ba/4b/4d/ba4b4d89ee0dcc15ac908758e0eb737a.jpg",
                "10",
                "PSG",
                "Neymar da Silva Santos Júnior (born 5 February 1992), known as Neymar, is a Brazilian professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and the Brazil national team. He is considered a versatile player, being able to play as either a central striker, second striker, winger or occasionally as an attacking midfielder. A prolific goalscorer and renowned playmaker, he is regarded as one of the best players in the world. Neymar has scored at least 100 goals for three different clubs, making him one of three players to achieve this."
            ),
            Birds(
                id = 4,
                "Mbappe",
                "https://www.topmercato.com/wp-content/uploads/2020-12-18-kylian-mbappe-1.jpg",
                "7",
                "PSG",
                "Kylian Mbappé Lottin (French pronunciation: \u200B[kiljan (ɛ)mbape lɔtɛ̃]; born 20 December 1998) is a French professional footballer who plays as a forward for Ligue 1 club Paris Saint-Germain and the France national team. Considered one of the best players in the world, and reportedly the highest-paid, Mbappé is renowned for his dribbling abilities, exceptional speed, and finishing.Born in Paris and raised in nearby Bondy, Mbappé began his senior club career in 2015 playing for Monaco, where he won the Ligue 1 title. In 2017, aged 18, Mbappé signed for Paris Saint-Germain on an eventual permanent transfer worth €180 million, making him the second-most expensive player and most expensive teenage player. There, he won four Ligue 1 titles, three Coupes de France, is the club's second-highest all-time top goalscorer, and helped the club reach their first UEFA Champions League Final in 2020."
            ),
            Birds(
                id = 5,
                "Modric",
                "https://upload.wikimedia.org/wikipedia/commons/e/e9/ISL-HRV_%287%29.jpg",
                "10",
                "Real Madrid",
                "Luka Modrić (Croatian pronunciation: [lûːka mǒːdritɕ]; born 9 September 1985) is a Croatian professional footballer who plays as a midfielder for La Liga club Real Madrid and captains the Croatia national team. He plays mainly as a central midfielder, but can also play as an attacking midfielder or as a defensive midfielder. He is widely regarded as one of the greatest midfielders of all time, and as the greatest Croatian footballer ever.\n" +
                        "\n" +
                        "Born in Zadar,[8] Modrić's childhood coincided with the Croatian War of Independence which displaced his family. In 2002, he was signed by Dinamo Zagreb at age 16, after showing promise with his hometown club NK Zadar's youth team. He continued his development in Zagreb, before spells on loan to Zrinjski Mostar and Inter Zaprešić. He made his debut for Dinamo in 2005 and won three consecutive league titles and domestic cups, being named the Prva HNL Player of the Year in 2007. In 2008, he moved to Premier League club Tottenham Hotspur for a club-record transfer fee of £16.5 million, where he led Spurs to their first UEFA Champions League appearance in almost 50 years, reaching the quarter-finals of the 2010–11 tournament."
            ),
            Birds(
                id = 6,
                "De Bryune",
                "https://s.hs-data.com/bilder/spieler/gross/142263.jpg?fallback=png",
                "17",
                "Man City",
                "Kevin De Bruyne[pronunciation?] (born 28 June 1991) is a Belgian professional footballer who plays as a midfielder for Premier League club Manchester City and the Belgium national team. He is widely regarded as one of the best players in the world and of his generation.Pundits have often described him as a \"complete footballer\".\n" +
                        "\n" +
                        "De Bruyne began his career at Genk, where he was a regular player when they won the 2010–11 Belgian Pro League. In 2012 he joined English club Chelsea, where he was used sparingly and then loaned to Werder Bremen. He signed with Wolfsburg for £18 million in 2014, where he established himself as one of the best players in the Bundesliga and was integral in the club's 2014–15 DFB-Pokal win. In the summer of 2015 De Bruyne joined Manchester City for a club record £54 million. He has since won four Premier League titles, five League Cups and an FA Cup with the club. In 2017–18 he had a significant role in Manchester City's record in becoming the only Premier League team to attain 100 points in a single season. In 2019–20, De Bruyne tied the record for most assists in a Premier League season and was awarded Player of the Season (which he won again in 2021–22)."
            ),
            Birds(
                id = 2,
                "Toni Kroos",
                "https://upload.wikimedia.org/wikipedia/commons/9/98/CSKA-RM18_%287%29_%28cropped%29.jpg",
                "8",
                "Real Madrid",
                "Toni Kroos (born 4 January 1990) is a German professional footballer who plays as a midfielder for La Liga club Real Madrid. Kroos plays mainly as a central midfielder, but has also been deployed as a deep-lying playmaker in his career. He is known for his vision, passing, creativity, crossing and set-piece ability,and is widely regarded as one of the greatest midfielders of all time.\n" +
                        "\n" +
                        "Kroos began his senior club career playing for Bayern Munich, where he made his debut at age 17 in 2007. He was sparingly used, and opted for an 18-month loan spell at fellow Bundesliga side Bayer Leverkusen, where he became a key contributor, and returned to his parent club with an increased profile in 2010. With Bayern, Kroos won two consecutive league titles (three titles in total), a UEFA Champions League title, two DFB-Pokal titles, and was voted into the league team of the season three times. In 2014, he joined Real Madrid in a transfer worth €25 million."
            ),
            Birds(
                id = 2,
                "Salah M",
                "https://cdn-japantimes.com/wp-content/uploads/2022/05/np_file_157183.jpeg",
                "10",
                "Liverpol",
                "Mohamed Salah Hamed Mahrous Ghaly (Arabic: محمد صلاح حامد محروس غالي, Egyptian Arabic pronunciation: [mæˈħam.mæd sˤɑˈlɑːħ ˈɣæːli]; born 15 June 1992) is an Egyptian professional footballer who plays as a forward for Premier League club Liverpool and captains the Egypt national team. Considered one of the best players in the world and amongst the greatest African players of all time, he is known for his finishing, dribbling, and speed.\n" +
                        "\n" +
                        "Salah started his senior career in 2010 playing for Al Mokawloon, departing in 2012 to join Basel, where he won two Swiss Super League titles. In 2014, Salah joined Chelsea for a reported fee of £11 million, but limited gametime led to successive loans to Fiorentina and Roma, who later signed him permanently for €15 million. In the 2016–17 season, Salah was a key figure in Roma's title race against ultimate league winners Juventus, reaching double figures in both goals and assists.\n" +
                        "\n" +
                        "In 2017, Salah signed for Liverpool for a then-club record transfer of £36.9 million. In his first season, he set the record for most Premier League goals scored (32) in a 38-game season and helped Liverpool to the 2018 UEFA Champions League Final. Salah went on to be an integral player in the club's Champions League and Premier League title successes the following two seasons, and has since also won the FA Cup and the League Cup. Salah has achieved numerous individual accolades, including two PFA Players' Player of the Year awards, three Premier League Golden Boots, the Premier League Player of the Season, the Premier League Playmaker of the Season, and finished third for the Best FIFA Men's Player in 2018 and 2021. He received the 2018 FIFA Puskás Award for his winning strike in the first Merseyside derby of the 2017–18 season."
            ),
            Birds(
                id = 2,
                "Di Maria", "https://s.hs-data.com/bilder/spieler/gross/43864.jpg", "11", "PSG",
                "Ángel Fabián Di María (born 14 February 1988) is an Argentine professional footballer who plays for Serie A club Juventus and the Argentina national team. He can play as either a winger or attacking midfielder. He is generally considered one of the best wingers in the world.\n" +
                        "\n" +
                        "Di María began his career with Rosario Central, but came into prominence at Benfica after signing for the club in 2007, aged 19. He helped Benfica win the Primeira Liga, the club's first league title in five years, and two Taça da Liga titles. In 2010, Di María moved to Spanish club Real Madrid in a transfer worth €25 million, where he won a La Liga title and the UEFA Champions League. He subsequently signed for Manchester United in 2014 in a then-British record deal worth £59.7 million (€75.6 million), but left a year later to join Paris Saint-Germain. In France, Di María won five league titles, five Coupe de France and four Coupe de la Ligue, which includes three domestic quadruples, and helped the club reach its first Champions League Final. He is also the club's ninth-highest goalscorer and all-time leader in assists."
            ),
            Birds(
                id = 2,
                "Paulo Dibala",
                "https://static.sports.uz/uploads/2020/Abdullajon/Pauli%20Dibala%20is%20not%20necessary.jpg",
                "10",
                "Yuventus",
                "Paulo Exequiel Dybala (born 15 November 1993) is an Argentine professional footballer who plays as a forward for Serie A club Roma and the Argentina national team.\n" +
                        "\n" +
                        "Nicknamed \"La Joya\" (\"The Jewel\"), Dybala began his senior club career in 2011 playing for Instituto de Córdoba, before signing for Palermo in 2012, at age 18, where he won a Serie B title. In 2015, Dybala signed for Juventus and won five league titles and four Coppas Italia. He was also voted Serie A Most Valuable Player once, was also included in the Serie A Team of the Year four times, and ranks as Juventus' ninth-highest all-time goalscorer.\n" +
                        "\n" +
                        "Dybala made his senior international debut for Argentina in 2015 at age 21, and has since earned over 30 caps, including appearing at the 2018 FIFA World Cup and the 2019 Copa América. In the latter, he scored the winning goal to help his nation finish in third place."
            ),
            Birds(
                id = 2,
                "Sergio Ramos",
                "https://netstorage-sportsbrief.akamaized.net/images/00119ea336903239.jpg",
                "4",
                "PSG",
                "Sergio Ramos García (Spanish pronunciation: [ˈseɾxjo ˈramos ɣaɾˈθi.a];born 30 March 1986) is a Spanish professional footballer who plays as a centre-back for Ligue 1 club Paris Saint-Germain and the Spain national team. Known for his aggressive play, ball retrieval ability and prolific goalscoring abilities, he is widely regarded as one of the greatest defenders of all time, having formerly played for Real Madrid for sixteen seasons, winning four UEFA Champions League titles with the Spanish giants along with two UEFA European Championship titles and the 2010 FIFA World Cup with the national team.\n" +
                        "\n" +
                        "After emerging through Sevilla's youth academy and spending two seasons with the senior side, Ramos moved to Real Madrid in the summer of 2005. Since then, he went on to become a mainstay for Real Madrid, and had won 22 major honours, including five La Liga titles and four UEFA Champions League titles, becoming one of La Liga's top goalscorers from a defensive position. He played a crucial part in the build-up to all four UEFA Champions League wins, being named in the competition Squad of the Season each time. He also scored the equaliser in the 93rd minute of the 2014 UEFA Champions League Final."
            ),
            Birds(
                id = 2,
                "Bukayo Saka",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Bukayo_Saka_2020_Interview.png/440px-Bukayo_Saka_2020_Interview.png",
                "7",
                "Arsenal",
                "Bukayo Ayoyinka T. M. Saka (born 5 September 2001) is an English professional footballer who plays as a winger, left-back, or midfielder for Premier League club Arsenal and the England national team. Saka is known for his attacking incisiveness and creativity, and is often considered one of the best young football players in the world.\n" +
                        "\n" +
                        "Saka has spent his entire senior career with Arsenal, where he has won an FA Cup and an FA Community Shield, progressively becoming one of Arsenal's most prolific and influential players.[8] Following the 2020−21 and 2021−22 seasons, he was named as Arsenal's player of the season.\n" +
                        "\n" +
                        "Saka has represented England at many youth levels, scoring six goals in 27 youth caps. He was first called up to the senior team on 1 October 2020 and made his debut in a friendly against Wales eight days later, starting the match which ended in a 3–0 victory"
            ),
            Birds(
                id = 2,
                "Kante", "https://s.hs-data.com/bilder/spieler/gross/211506.jpg", "7", "Chelsea",
                "N'Golo Kanté (born 29 March 1991) is a French professional footballer who plays as a central midfielder for Premier League club Chelsea and the France national team. Considered by many to be one of the world's best midfielders, Kanté is widely praised for his work rate and defensive acumen.\n" +
                        "\n" +
                        "Kanté made his senior professional debut with Boulogne in 2012, appearing as a substitute in one Ligue 2 match, and played an entire season in the third division the following year. After that he joined Ligue 2 side Caen on a free transfer, finished third and won promotion to Ligue 1. He stayed with the club for one more year. In 2015, Kanté joined Leicester City for a fee worth £5.6 million.\n" +
                        "\n" +
                        "Kanté was an integral part of the Leicester City team that went on to become surprise Premier League champions in 2016. The following year, he joined Chelsea for a fee worth £32 million and again won the league, making him the first outfield player to win consecutive English league titles with different clubs since Eric Cantona in 1992 and 1993. With Chelsea he has won the FA Cup, the UEFA Europa League, the UEFA Champions League, the UEFA Super Cup, the FIFA Club World Cup. Individually, Kante has been awarded the Premier League Player of the Season, the PFA Players' Player of the Year, the FWA Footballer of the Year, the UEFA Men's Midfielder of the year and the Trophées UNFP for Best French Player Abroad twice."
            ),
            Birds(
                id = 2,
                "Sadio Mane",
                "https://www.aljazeera.com/wp-content/uploads/2022/06/2022-06-17T144533Z_1219395816_RC2YZT91B9E4_RTRMADP_3_SOCCER-GERMANY-BAY-MANE.jpg?resize=770%2C513",
                "10",
                "Liverpol",
                "Sadio Mané (born 10 April 1992) is a Senegalese professional footballer who plays as a forward for Bundesliga club Bayern Munich and the Senegal national team. Considered one of the best players in the world and amongst the greatest African players of all time, he is known for his pressing, dribbling, and speed.\n" +
                        "\n" +
                        "Mané began his professional career with Ligue 2 club Metz at the age of 19, but he departed after a solitary season to join Austrian club Red Bull Salzburg in 2012 for a fee of €4 million, winning a league and cup domestic double in the 2013–14 season. Later that summer, Mané transferred to English club Southampton for a club record fee of £11.8 million. There, he set a new Premier League record for the fastest hat-trick, scored in 176 seconds in a 6–1 win over Aston Villa in 2015.\n" +
                        "\n" +
                        "Mané signed for fellow Premier League club Liverpool in 2016, for a reported fee of £34 million. He helped the side reach back-to-back UEFA Champions League Finals in 2018 and 2019, winning the latter. He also finished as the league's joint-top goalscorer in the 2018–19 season, winning the Premier League Golden Boot. Mané then helped end Liverpool's 30-year league title drought by winning the 2019–20 Premier League. In October 2021, he scored his 100th Premier League goal, becoming the third African to reach the landmark. Mané finished fourth for the 2019 Ballon d'Or, and in The Best FIFA Men's Player he ranked fifth in 2019 and fourth in 2020."
            ),
            Birds(
                id = 2,
                "Ansu Fati",
                "https://www.fcbarcelona.com/photo-resources/2022/07/01/b2a278a7-0004-4148-982d-d206011dacf4/jugador_fitxa-ansu.jpg?width=1200&height=750",
                "31",
                "Barceleno",
                "Anssumane \"Ansu\" Fati Vieira (born 31 October 2002) is a Spanish professional footballer who plays as a forward for La Liga club Barcelona and the Spain national team.\n" +
                        "\n" +
                        "He was born in Guinea-Bissau but chose to represent the Spain national team after gaining citizenship.He is widely considered one of Spain's most exciting football talents, and one of the best young players in the world."
            ),
            Birds(
                id = 2,
                "Trent Alexander-Arnold",
                "https://resources.premierleague.com/premierleague/photos/players/250x250/p169187.png",
                "66",
                "Liverpol",
                "Trent John Alexander-Arnold (born 7 October 1998) is an English professional footballer who plays as a right-back for Premier League club Liverpool and the England national team. Known for his range of passing and providing assists, he is regarded as one of the best right-backs in world football.Alexander-Arnold joined Liverpool's academy in 2004 and captained the club across its youth levels. He made his senior debut in 2016, at age 18, and played in back-to-back UEFA Champions League finals in 2018 and 2019, winning the latter, and being named in the Champions League Squad of the Season. These appearances made Alexander-Arnold the youngest player to start in consecutive finals in the competition. In the same year, he won the UEFA Super Cup and the FIFA Club World Cup. In domestic football, he won the 2019–20 PFA Young Player of the Year and the inaugural Premier League Young Player of the Season awards, has twice been named in the PFA Team of the Year, and helped end Liverpool's 30-year league title drought by winning the 2019–20 Premier League."
            ),
        )
    }
}