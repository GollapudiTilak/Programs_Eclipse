package com.console;

import java.util.*;

public class Dmart {
	static double total = 0;
	static StringBuilder bill = new StringBuilder();

	static void addItem(String item, double price) {
		bill.append(item).append(" - ₹").append(price).append("\n");
	}

	static void addAndPrint(String item, double price) {
		System.out.println(item + " - ₹" + price);
		total += price;
		addItem(item, price);
	}

	public static void main(String[] args) {
		System.out.println("====== WELCOME TO DMART SERVICES ======");

		Scanner sc = new Scanner(System.in);
		String again;
		do {
			System.out.println("\nPlease Enter the Category (or type exit to stop) : ");
			System.out.println(
					"Categories: groceries | stationary | electrical | snacks | cloths | dairy | kitchen | pooja");
			String cate = sc.next();

			if (cate.equalsIgnoreCase("exit")) {
				break;
			}
			switch (cate) {
			case "groceries" -> {
				System.out.println("Select The Grocery Sub-Category:");
				System.out.println(
						"oil | ghee | rice | detergent-fabric-care | toilet-cleaner | bath-body | soap | body-wash | shampoo | handwash | salt | sugar | pulses | atta | spices");
				String sub = sc.next();

				switch (sub) {
				case "oil" -> {
					System.out.println("Select the Oil Brand:");
					System.out.println(
							"gro-oil | vij-gro-oil | pri-gro-oil | sun-oil | free-sun-oil | for-oil | for-rice | free-rice | pri-rice | saff | saff-tasty | gold | winner | heal");
					String oil = sc.next();

					switch (oil) {
					case "gro-oil" -> {
						System.out.println("Select Quantity (1l / 5l):");
						String qty = sc.next();
						switch (qty) {
						case "1l" -> addAndPrint("Freedom Groundnut Oil (1 Litre)", 180);
						case "5l" -> addAndPrint("Freedom Groundnut Oil (5 Litre Jar)", 850);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "vij-gro-oil" -> addAndPrint("Vijaya Groundnut Oil (Standard Pack)", 170);
					case "pri-gro-oil" -> addAndPrint("Priya Groundnut Oil (Standard Pack)", 175);
					case "sun-oil" -> {
						System.out.println("Select Quantity (1l / 5l):");
						String qty = sc.next();
						switch (qty) {
						case "1l" -> addAndPrint("Sunflower Oil (1 Litre)", 160);
						case "5l" -> addAndPrint("Sunflower Oil (5 Litre)", 780);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "free-sun-oil" -> addAndPrint("Freedom Sunflower Oil (Standard Pack)", 165);
					case "for-oil" -> {
						System.out.println("Select Quantity (1l / 5l):");
						String qty = sc.next();
						switch (qty) {
						case "1l" -> addAndPrint("Fortune Sunflower Oil (1 Litre)", 170);
						case "5l" -> addAndPrint("Fortune Sunflower Oil (5 Litre)", 820);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "for-rice" -> addAndPrint("Fortune Rice Bran Health Oil (Standard Pack)", 160);
					case "free-rice" -> addAndPrint("Freedom Rice Bran Oil (Standard Pack)", 155);
					case "pri-rice" -> addAndPrint("Priya Rice Rich Bran Oil (Standard Pack)", 165);
					case "saff" -> {
						System.out.println("Select Quantity (1l / 5l):");
						String qty = sc.next();
						switch (qty) {
						case "1l" -> addAndPrint("Saffola Gold Oil (1 Litre)", 210);
						case "5l" -> addAndPrint("Saffola Gold Oil (5 Litre)", 990);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "saff-tasty" -> addAndPrint("Saffola Tasty Oil (Standard Pack)", 200);
					case "gold" -> addAndPrint("Gold Drop Sunflower Oil (Standard Pack)", 150);
					case "winner" -> addAndPrint("Gold Winner Sunflower Oil Pouch", 155);
					case "heal" -> addAndPrint("Healthy Heart Sunflower Oil", 165);
					default -> System.out.println("Sorry, Oil brand not available.");
					}
				}
				case "ghee" -> {
					System.out.println("Select the Ghee Brand:");
					System.out.println(
							"amul | amul-refill | amul-tin | dodla | dodla-jar | grb | grb-jar | vij | vij-cow | dur | godrej | godrej-cow-jar | jersey-cream");
					String ghee = sc.next();

					switch (ghee) {
					case "amul" -> {
						System.out.println("Select Quantity (500ml / 1l):");
						String qty = sc.next();
						switch (qty) {
						case "500ml" -> addAndPrint("Amul Pure Cow Ghee (500 ml)", 320);
						case "1l" -> addAndPrint("Amul Pure Ghee (1 Litre)", 620);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "amul-refill" -> addAndPrint("Amul Ghee Refill (1 Litre)", 600);
					case "amul-tin" -> addAndPrint("Amul High Aroma Cow Ghee Tin (1 Litre)", 650);
					case "dodla" -> {
						System.out.println("Select Quantity (500ml / 1l):");
						String qty = sc.next();
						switch (qty) {
						case "500ml" -> addAndPrint("Dodla Cow Ghee (500 ml)", 300);
						case "1l" -> addAndPrint("Dodla Ghee (1 Litre)", 590);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "dodla-jar" -> addAndPrint("Dodla Ghee Jar (200 ml)", 140);
					case "grb" -> {
						System.out.println("Select Quantity (500ml / 1l):");
						String qty = sc.next();
						switch (qty) {
						case "500ml" -> addAndPrint("GRB Ghee (500 ml)", 310);
						case "1l" -> addAndPrint("GRB Ghee (1 Litre)", 610);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "grb-jar" -> addAndPrint("GRB Ghee Jar (500 ml)", 320);
					case "vij" -> addAndPrint("Vijaya Pure Ghee (500 ml)", 300);
					case "vij-cow" -> addAndPrint("Vijaya Cow Ghee (1 Litre)", 600);
					case "dur" -> addAndPrint("Durga Fresh & Pure Ghee (500 ml)", 290);
					case "godrej" -> addAndPrint("Godrej Jersey Cow Ghee (1 Litre)", 610);
					case "godrej-cow-jar" -> addAndPrint("Godrej Jersey Cow Ghee Jar (1 Litre)", 620);
					case "jersey-cream" -> addAndPrint("Creamline Jersey Ghee (1 Litre)", 605);
					default -> System.out.println("Sorry, Ghee brand not available.");
					}
				}
				case "rice" -> {
					System.out.println("Select the Rice Brand:");
					System.out.println("zeeba | daawat | india_gate | sona_masoori");
					String rice = sc.next();

					switch (rice) {
					case "zeeba" -> {
						System.out.println("Select Quantity (1kg / 5kg):");
						String qty = sc.next();
						switch (qty) {
						case "1kg" -> addAndPrint("Zeeba Premium Biryani Basmati Rice (1Kg)", 180);
						case "5kg" -> addAndPrint("Zeeba Premium Biryani Basmati Rice (5Kg)", 850);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "daawat" -> {
						System.out.println("Select Type (pulav / heritage / biryani):");
						String type = sc.next();
						switch (type) {
						case "pulav" -> addAndPrint("Daawat Pulav Basmati Rice (500g)", 75);
						case "heritage" -> {
							System.out.println("Select Quantity (1kg / 5kg):");
							String qty = sc.next();
							switch (qty) {
							case "1kg" -> addAndPrint("Daawat Heritage Platinum Basmati Rice (1Kg)", 210);
							case "5kg" -> addAndPrint("Daawat Heritage Platinum Basmati Rice (5Kg)", 980);
							default -> System.out.println("Invalid Quantity");
							}
						}
						case "biryani" -> {
							System.out.println("Select Quantity (1kg / 5kg):");
							String qty = sc.next();
							switch (qty) {
							case "1kg" -> addAndPrint("Daawat Biryani Basmati Rice (1Kg)", 200);
							case "5kg" -> addAndPrint("Daawat Biryani Basmati Rice (5Kg)", 950);
							default -> System.out.println("Invalid Quantity");
							}
						}
						default -> System.out.println("Daawat type not available.");
						}
					}
					case "india_gate" -> {
						System.out.println("Select Quantity (1kg / 5kg):");
						String qty = sc.next();
						switch (qty) {
						case "1kg" -> addAndPrint("India Gate Biryani Pure Basmati Rice (1Kg)", 220);
						case "5kg" -> addAndPrint("India Gate Classic Basmati Rice (5Kg)", 1050);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "sona_masoori" -> {
						System.out.println("Select Quantity (5kg / 10kg / 26kg):");
						String qty = sc.next();
						switch (qty) {
						case "5kg" -> addAndPrint("Sona Masoori Rice (5Kg)", 280);
						case "10kg" -> addAndPrint("Sona Masoori Rice (10Kg)", 550);
						case "26kg" -> addAndPrint("Sona Masoori Rice (26Kg)", 1400);
						default -> System.out.println("Invalid Quantity");
						}
					}
					default -> System.out.println("Sorry, Rice brand not available.");
					}
				}
				case "detergent-fabric-care" -> {
					System.out.println("Select Detergent / Fabric Care Product:");
					System.out.println("surf-excel | ariel | tide | rin | comfort");
					String det = sc.next();

					switch (det) {
					case "surf-excel" -> {
						System.out.println("Select Quantity (500g / 1kg / 2kg / 5kg):");
						String qty = sc.next();
						switch (qty) {
						case "500g" -> addAndPrint("Surf Excel Easy Wash (500g)", 110);
						case "1kg" -> addAndPrint("Surf Excel Matic Powder (1kg)", 210);
						case "2kg" -> addAndPrint("Surf Excel Matic Family Pack (2kg)", 390);
						case "5kg" -> addAndPrint("Surf Excel Matic Big Pack (5kg)", 900);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "ariel" -> {
						System.out.println("Select Quantity (500g / 1kg / 2kg / liquid-1l):");
						String qty = sc.next();
						switch (qty) {
						case "500g" -> addAndPrint("Ariel Detergent Powder (500g)", 115);
						case "1kg" -> addAndPrint("Ariel Complete Wash (1kg)", 220);
						case "2kg" -> addAndPrint("Ariel Family Pack (2kg)", 420);
						case "liquid-1l" -> addAndPrint("Ariel Matic Liquid Detergent (1L)", 260);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "tide" -> {
						System.out.println("Select Quantity (500g / 1kg / 2kg):");
						String qty = sc.next();
						switch (qty) {
						case "500g" -> addAndPrint("Tide Double Power (500g)", 90);
						case "1kg" -> addAndPrint("Tide Double Power (1kg)", 170);
						case "2kg" -> addAndPrint("Tide Family Pack (2kg)", 330);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "rin" -> {
						System.out.println("Select Quantity (500g / 1kg / bar):");
						String qty = sc.next();
						switch (qty) {
						case "500g" -> addAndPrint("Rin Detergent Powder (500g)", 80);
						case "1kg" -> addAndPrint("Rin Detergent Powder (1kg)", 150);
						case "bar" -> addAndPrint("Rin Detergent Bar", 25);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "comfort" -> {
						System.out.println("Select Quantity (400ml / 800ml / 2l):");
						String qty = sc.next();
						switch (qty) {
						case "400ml" -> addAndPrint("Comfort Fabric Conditioner (400ml)", 120);
						case "800ml" -> addAndPrint("Comfort Fabric Conditioner (800ml)", 220);
						case "2l" -> addAndPrint("Comfort Fabric Conditioner (2L)", 450);
						default -> System.out.println("Invalid Quantity");
						}
					}
					default -> System.out.println("Sorry, Detergent / Fabric Care product not available.");
					}
				}
				case "toilet" -> {
					System.out.println("Select Toilet Cleaner Brand:");
					System.out.println("harpic | domex | lizol");
					String cleaner = sc.next();

					switch (cleaner) {
					case "harpic" -> {
						System.out.println("Select Quantity (200ml / 500ml / 1l):");
						String qty = sc.next();
						switch (qty) {
						case "200ml" -> addAndPrint("Harpic Toilet Cleaner (200ml)", 50);
						case "500ml" -> addAndPrint("Harpic Toilet Cleaner (500ml)", 110);
						case "1l" -> addAndPrint("Harpic Power Plus Toilet Cleaner (1L)", 180);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "domex" -> {
						System.out.println("Select Quantity (500ml / 1l):");
						String qty = sc.next();
						switch (qty) {
						case "500ml" -> addAndPrint("Domex Toilet Cleaner (500ml)", 120);
						case "1l" -> addAndPrint("Domex Fresh Guard Toilet Cleaner (1L)", 230);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "lizol" -> {
						System.out.println("Select Quantity (500ml / 1l / 2l):");
						String qty = sc.next();
						switch (qty) {
						case "500ml" -> addAndPrint("Lizol Bathroom Cleaner (500ml)", 80);
						case "1l" -> addAndPrint("Lizol Disinfectant Cleaner (1L)", 160);
						case "2l" -> addAndPrint("Lizol Family Pack (2L)", 300);
						default -> System.out.println("Invalid Quantity");
						}
					}
					default -> System.out.println("Sorry, Toilet Cleaner brand not available.");
					}
				}
				case "bath-body" -> {
					System.out.println("Select Bath & Body Category:");
					System.out.println("soap | body-wash | shampoo | handwash");
					String bath = sc.next();

					switch (bath) {
					case "soap" -> {
						System.out.println("Select Soap Brand:");
						System.out.println(
								"dove | pears | lifebuoy | lux | cinthol | santoor | godrej_no1 | medimix | mysore_sandal");
						String soap = sc.next();

						switch (soap) {
						case "dove" -> addAndPrint("Dove Cream Beauty Bathing Bar", 55);
						case "pears" -> addAndPrint("Pears Pure & Gentle Soap", 45);
						case "lifebuoy" -> addAndPrint("Lifebuoy Germ Protection Soap", 35);
						case "lux" -> addAndPrint("Lux Soft Glow Beauty Soap", 50);
						case "cinthol" -> addAndPrint("Cinthol Deo Soap", 48);
						case "santoor" -> addAndPrint("Santoor Sandal & Turmeric Soap", 42);
						case "godrej_no1" -> addAndPrint("Godrej No.1 Soap", 28);
						case "medimix" -> addAndPrint("Medimix Ayurvedic Soap", 52);
						case "mysore_sandal" -> addAndPrint("Mysore Sandal Soap", 60);
						default -> System.out.println("Sorry, Soap brand not available.");
						}
					}
					case "body-wash" -> {
						System.out.println("Select Body Wash Brand:");
						System.out.println("dove | fiama | nivea | dettol");
						String bw = sc.next();

						switch (bw) {
						case "dove" -> {
							System.out.println("Select Quantity (250ml / 500ml / 1l):");
							String qty = sc.next();
							switch (qty) {
							case "250ml" -> addAndPrint("Dove Body Wash (250ml)", 200);
							case "500ml" -> addAndPrint("Dove Body Wash (500ml)", 350);
							case "1l" -> addAndPrint("Dove Body Wash (1 Litre)", 600);
							default -> System.out.println("Invalid Quantity");
							}
						}
						case "fiama" -> addAndPrint("Fiama Gel Body Wash", 180);
						case "nivea" -> addAndPrint("Nivea Shower Gel Body Wash", 220);
						case "dettol" -> addAndPrint("Dettol Skin Care Shower Gel", 210);
						default -> System.out.println("Sorry, Body Wash brand not available.");
						}
					}
					case "shampoo" -> {
						System.out.println("Select Shampoo Brand:");
						System.out.println("dove | head_shoulders | clinic_plus | sunsilk | tresemme | loreal");
						String shampoo = sc.next();

						switch (shampoo) {
						case "dove" -> addAndPrint("Dove Hair Fall Rescue Shampoo", 180);
						case "head_shoulders" -> addAndPrint("Head & Shoulders Anti-Dandruff Shampoo", 190);
						case "clinic_plus" -> addAndPrint("Clinic Plus Strong & Long Shampoo", 120);
						case "sunsilk" -> addAndPrint("Sunsilk Lively Clean Shampoo", 160);
						case "tresemme" -> addAndPrint("Tresemme Keratin Shampoo", 350);
						case "loreal" -> addAndPrint("L'Oreal Paris Total Repair Shampoo", 400);
						default -> System.out.println("Sorry, Shampoo brand not available.");
						}
					}
					case "handwash" -> {
						System.out.println("Select Handwash Brand:");
						System.out.println("dettol | lifebuoy | palmolive | godrej");
						String hw = sc.next();

						switch (hw) {
						case "dettol" -> addAndPrint("Dettol Antibacterial Handwash", 110);
						case "lifebuoy" -> addAndPrint("Lifebuoy Handwash", 95);
						case "palmolive" -> addAndPrint("Palmolive Handwash", 120);
						case "godrej" -> addAndPrint("Godrej Protekt Handwash", 105);
						default -> System.out.println("Sorry, Handwash not available.");
						}
					}
					default -> System.out.println("Sorry, Bath & Body category not available.");
					}
				}
				case "salt" -> {
					System.out.println("Select Salt Type (iodized / rock / black):");
					String salt = sc.next();
					switch (salt) {
					case "iodized" -> addAndPrint("Iodized Salt", 20);
					case "rock" -> addAndPrint("Rock Salt (Sendha Namak)", 25);
					case "black" -> addAndPrint("Black Salt", 30);
					default -> System.out.println("Salt not available.");
					}
				}
				case "sugar" -> {
					System.out.println("Select Quantity (1kg / 5kg):");
					String qty = sc.next();
					switch (qty) {
					case "1kg" -> addAndPrint("Refined Sugar (1Kg)", 45);
					case "5kg" -> addAndPrint("Refined Sugar (5Kg)", 220);
					default -> System.out.println("Invalid Quantity");
					}
				}
				case "pulses" -> {
					System.out.println("Select Pulse Type:");
					System.out.println("toor_dal | moong_dal | chana_dal | urad_dal | masoor_dal");
					String pulse = sc.next();
					switch (pulse) {
					case "toor_dal" -> addAndPrint("Toor Dal (Arhar Dal)", 70);
					case "moong_dal" -> addAndPrint("Moong Dal", 90);
					case "chana_dal" -> addAndPrint("Chana Dal", 60);
					case "urad_dal" -> addAndPrint("Urad Dal", 100);
					case "masoor_dal" -> addAndPrint("Masoor Dal", 80);
					default -> System.out.println("Pulse not available.");
					}
				}
				case "atta" -> {
					System.out.println("Select Atta Type (wheat / maida / besan):");
					String atta = sc.next();
					switch (atta) {
					case "wheat" -> {
						System.out.println("Select Quantity (1kg / 5kg / 10kg):");
						String qty = sc.next();
						switch (qty) {
						case "1kg" -> addAndPrint("Wheat Atta (1Kg)", 45);
						case "5kg" -> addAndPrint("Wheat Atta (5Kg)", 210);
						case "10kg" -> addAndPrint("Wheat Atta (10Kg)", 400);
						default -> System.out.println("Invalid Quantity");
						}
					}
					case "maida" -> addAndPrint("Maida (Refined Flour)", 40);
					case "besan" -> addAndPrint("Besan (Gram Flour)", 85);
					default -> System.out.println("Atta type not available.");
					}
				}
				case "spices" -> {
					System.out.println("Select Spice:");
					System.out.println("turmeric | chilli | jeera | coriander | garam_masala");
					String spice = sc.next();
					switch (spice) {
					case "turmeric" -> addAndPrint("Turmeric Powder (Haldi)", 60);
					case "chilli" -> addAndPrint("Red Chilli Powder", 120);
					case "jeera" -> addAndPrint("Cumin (Jeera)", 150);
					case "coriander" -> addAndPrint("Coriander Powder", 70);
					case "garam_masala" -> addAndPrint("Garam Masala", 180);
					default -> System.out.println("Spice not available.");
					}
				}

				}
			}
			case "stationary" -> {
				System.out.println("Select Stationery Category:");
				System.out.println("writing | notebook | geometry | office | art");
				String st = sc.next();

				switch (st) {
				case "writing" -> {
					System.out.println("Select Writing Item (pen / pencil / marker / highlighter):");
					String write = sc.next();
					switch (write) {
					case "pen" -> {
						System.out.println("Select Pen Type (ball / gel / fountain):");
						String pen = sc.next();
						switch (pen) {
						case "ball" -> addAndPrint("Ball Pen Pack (10 pcs)", 50);
						case "gel" -> addAndPrint("Gel Pen Pack (5 pcs)", 75);
						case "fountain" -> addAndPrint("Fountain Pen", 120);
						default -> System.out.println("Pen type not available.");
						}
					}
					case "pencil" -> addAndPrint("HB Pencil Pack (10 pcs)", 40);
					case "marker" -> addAndPrint("Permanent Marker", 35);
					case "highlighter" -> addAndPrint("Highlighter Pack (5 pcs)", 80);
					default -> System.out.println("Writing item not available.");
					}

				}
				case "notebook" -> {
					System.out.println("Select Notebook Type (single / double / ruled / register / drawing):");
					String book = sc.next();
					switch (book) {
					case "single" -> addAndPrint("Single Line Notebook", 45);
					case "double" -> addAndPrint("Double Line Notebook", 45);
					case "ruled" -> addAndPrint("Ruled Notebook", 50);
					case "register" -> addAndPrint("Office Register Book", 120);
					case "drawing" -> addAndPrint("Drawing Book", 60);
					default -> System.out.println("Notebook not available.");
					}
				}
				case "geometry" -> {
					System.out.println("Select Geometry Item (scale / compass / protractor / set-square):");
					String geo = sc.next();
					switch (geo) {
					case "scale" -> addAndPrint("30cm Scale", 15);
					case "compass" -> addAndPrint("Compass Box Set", 80);
					case "protractor" -> addAndPrint("Protractor", 20);
					case "set-square" -> addAndPrint("Set Square Set", 30);
					default -> System.out.println("Geometry item not available.");
					}
				}
				case "office" -> {
					System.out.println("Select Office Item (stapler / clips / binder / glue / scissors):");
					String off = sc.next();
					switch (off) {
					case "stapler" -> addAndPrint("Stapler with Pins", 95);
					case "clips" -> addAndPrint("Paper Clips Pack (100 pcs)", 30);
					case "binder" -> addAndPrint("Binder Clips Pack (12 pcs)", 40);
					case "glue" -> addAndPrint("Glue Stick", 25);
					case "scissors" -> addAndPrint("Office Scissors", 55);
					default -> System.out.println("Office item not available.");
					}
				}
				case "art" -> {
					System.out.println("Select Art Item (crayons / colours / watercolour / sketch):");
					String art = sc.next();
					switch (art) {
					case "crayons" -> addAndPrint("Crayons Box (24 shades)", 85);
					case "colours" -> addAndPrint("Colour Pencil Set (12 pcs)", 70);
					case "watercolour" -> addAndPrint("Water Colour Set (12 shades)", 110);
					case "sketch" -> addAndPrint("Sketch Pen Set (24 pcs)", 95);
					default -> System.out.println("Art item not available.");
					}
				}
				default -> System.out.println("Stationery category not available.");
				}
			}
			case "electrical" -> {
				System.out.println("Select Electrical Category:");
				System.out.println("lighting | fans | cables | batteries | appliances | switches");
				String elec = sc.next();

				switch (elec) {
				case "lighting" -> {
					System.out.println("Select Lighting Item (led-bulb / tube-light / emergency-light):");
					String light = sc.next();
					switch (light) {
					case "led-bulb" -> {
						System.out.println("Select Watt (9w / 12w / 15w):");
						String watt = sc.next();
						switch (watt) {
						case "9w" -> addAndPrint("LED Bulb 9W", 80);
						case "12w" -> addAndPrint("LED Bulb 12W", 100);
						case "15w" -> addAndPrint("LED Bulb 15W", 120);
						default -> System.out.println("Invalid Watt");
						}
					}
					case "tube-light" -> addAndPrint("LED Tube Light (20W)", 280);
					case "emergency-light" -> addAndPrint("Emergency Light", 650);
					default -> System.out.println("Lighting item not available.");
					}
				}
				case "fans" -> {
					System.out.println("Select Fan Type (ceiling / table / wall):");
					String fan = sc.next();
					switch (fan) {
					case "ceiling" -> addAndPrint("Ceiling Fan", 1800);
					case "table" -> addAndPrint("Table Fan", 1200);
					case "wall" -> addAndPrint("Wall Fan", 1500);
					default -> System.out.println("Fan not available.");
					}
				}
				case "cables" -> {
					System.out.println("Select Cable Item (usb / hdmi / extension):");
					String cable = sc.next();
					switch (cable) {
					case "usb" -> addAndPrint("USB Cable (1m)", 150);
					case "hdmi" -> addAndPrint("HDMI Cable (1.5m)", 350);
					case "extension" -> addAndPrint("Extension Board (4 Socket)", 299);
					default -> System.out.println("Cable not available.");
					}
				}
				case "batteries" -> {
					System.out.println("Select Battery Type (aa / aaa / 9v):");
					String bat = sc.next();
					switch (bat) {
					case "aa" -> addAndPrint("AA Battery Pack (4 pcs)", 80);
					case "aaa" -> addAndPrint("AAA Battery Pack (4 pcs)", 80);
					case "9v" -> addAndPrint("9V Battery", 60);
					default -> System.out.println("Battery not available.");
					}
				}
				case "appliances" -> {
					System.out.println("Select Appliance (kettle / iron / toaster / mixer):");
					String app = sc.next();
					switch (app) {
					case "kettle" -> addAndPrint("Electric Kettle (1.5L)", 799);
					case "iron" -> addAndPrint("Electric Iron Box", 650);
					case "toaster" -> addAndPrint("Bread Toaster (2 Slice)", 899);
					case "mixer" -> addAndPrint("Mixer Grinder (750W)", 2499);
					default -> System.out.println("Appliance not available.");
					}
				}
				case "switches" -> {
					System.out.println("Select Switch Item (board / plug / holder):");
					String sw = sc.next();
					switch (sw) {
					case "board" -> addAndPrint("Switch Board (6A)", 120);
					case "plug" -> addAndPrint("3 Pin Plug (6A)", 45);
					case "holder" -> addAndPrint("Bulb Holder (Batten Type)", 30);
					default -> System.out.println("Switch item not available.");
					}
				}
				default -> System.out.println("Sorry, Electrical category not available.");
				}
			}
			case "snacks" -> {
				System.out.println("Select Snacks Category:");
				System.out.println("chips | namkeen | biscuits | chocolate | instant");
				String sn = sc.next();

				switch (sn) {
				case "chips" -> {
					System.out.println("Select Chips Brand (lays / kurkure / bingo / uncle):");
					String chip = sc.next();
					switch (chip) {
					case "lays" -> addAndPrint("Lay's Chips Pack (26g)", 20);
					case "kurkure" -> addAndPrint("Kurkure Masala Munch (90g)", 30);
					case "bingo" -> addAndPrint("Bingo Chips Pack (90g)", 30);
					case "uncle" -> addAndPrint("Uncle Chipps Pack (90g)", 30);
					default -> System.out.println("Chips not available.");
					}
				}
				case "namkeen" -> {
					System.out.println("Select Namkeen (haldiram / mixture / peanuts / chana):");
					String nam = sc.next();
					switch (nam) {
					case "haldiram" -> addAndPrint("Haldiram Namkeen Mix (200g)", 60);
					case "mixture" -> addAndPrint("Spicy Mixture Pack (200g)", 40);
					case "peanuts" -> addAndPrint("Roasted Peanuts (200g)", 35);
					case "chana" -> addAndPrint("Roasted Chana (200g)", 30);
					default -> System.out.println("Namkeen not available.");
					}
				}
				case "biscuits" -> {
					System.out.println("Select Biscuit Brand (parle-g / oreo / good-day / marie / bourbon):");
					String biscuit = sc.next();
					switch (biscuit) {
					case "parle-g" -> addAndPrint("Parle-G Biscuit Pack (250g)", 15);
					case "oreo" -> addAndPrint("Oreo Biscuit Pack (120g)", 40);
					case "good-day" -> addAndPrint("Good Day Biscuits (150g)", 30);
					case "marie" -> addAndPrint("Marie Gold Biscuits (250g)", 30);
					case "bourbon" -> addAndPrint("Bourbon Biscuits (150g)", 25);
					default -> System.out.println("Biscuits not available.");
					}
				}
				case "chocolate" -> {
					System.out.println("Select Chocolate (dairy-milk / kitkat / perk / 5star / munch):");
					String choc = sc.next();
					switch (choc) {
					case "dairy-milk" -> addAndPrint("Dairy Milk Chocolate (40g)", 50);
					case "kitkat" -> addAndPrint("KitKat Chocolate (37.5g)", 40);
					case "perk" -> addAndPrint("Perk Chocolate (38g)", 20);
					case "5star" -> addAndPrint("5 Star Chocolate (40g)", 20);
					case "munch" -> addAndPrint("Munch Chocolate (25g)", 20);
					default -> System.out.println("Chocolate not available.");
					}
				}
				case "instant" -> {
					System.out.println("Select Instant Food (maggi / cup-noodles / pasta / soup):");
					String ins = sc.next();
					switch (ins) {
					case "maggi" -> addAndPrint("Maggi Noodles Pack (70g x 4)", 68);
					case "cup-noodles" -> addAndPrint("Cup Noodles (70g)", 35);
					case "pasta" -> addAndPrint("Instant Pasta Pack (70g)", 45);
					case "soup" -> addAndPrint("Soup Packet (Knorr / Maggi)", 30);
					default -> System.out.println("Instant food not available.");
					}
				}
				default -> System.out.println("Snacks category not available.");
				}
			}
			case "cloths" -> {
				System.out.println("Select Clothing Category:");
				System.out.println("men | women | kids | innerwear");
				String cloth = sc.next();

				switch (cloth) {
				case "men" -> {
					System.out.println("Select Men Clothing Type (shirt / pants / shorts / night-pants):");
					String men = sc.next();
					switch (men) {
					case "shirt" -> {
						System.out.println("Select Size (s / m / l / xl):");
						String size = sc.next();
						switch (size) {
						case "s" -> addAndPrint("Men Cotton Shirt (Small)", 499);
						case "m" -> addAndPrint("Men Cotton Shirt (Medium)", 499);
						case "l" -> addAndPrint("Men Cotton Shirt (Large)", 499);
						case "xl" -> addAndPrint("Men Cotton Shirt (XL)", 549);
						default -> System.out.println("Invalid Size");
						}
					}
					case "pants" -> {
						System.out.println("Select Size (28 / 30 / 32 / 34 / 36):");
						String size = sc.next();
						switch (size) {
						case "28" -> addAndPrint("Men Formal Pants (28)", 699);
						case "30" -> addAndPrint("Men Formal Pants (30)", 699);
						case "32" -> addAndPrint("Men Formal Pants (32)", 699);
						case "34" -> addAndPrint("Men Formal Pants (34)", 699);
						case "36" -> addAndPrint("Men Formal Pants (36)", 749);
						default -> System.out.println("Invalid Size");
						}
					}
					case "shorts" -> {
						System.out.println("Select Size (s / m / l / xl):");
						String size = sc.next();
						switch (size) {
						case "s" -> addAndPrint("Men Cotton Shorts (Small)", 349);
						case "m" -> addAndPrint("Men Cotton Shorts (Medium)", 349);
						case "l" -> addAndPrint("Men Cotton Shorts (Large)", 349);
						case "xl" -> addAndPrint("Men Cotton Shorts (XL)", 399);
						default -> System.out.println("Invalid Size");
						}
					}
					case "night-pants" -> {
						System.out.println("Select Size (s / m / l / xl):");
						String size = sc.next();
						switch (size) {
						case "s" -> addAndPrint("Men Night Pants (Small)", 299);
						case "m" -> addAndPrint("Men Night Pants (Medium)", 299);
						case "l" -> addAndPrint("Men Night Pants (Large)", 299);
						case "xl" -> addAndPrint("Men Night Pants (XL)", 349);
						default -> System.out.println("Invalid Size");
						}
					}
					default -> System.out.println("Men clothing not available.");
					}
				}
				case "women" -> {
					System.out.println("Select Women Clothing Type (top / kurti / leggings / jeans / night-suit):");
					String women = sc.next();
					switch (women) {
					case "top" -> addAndPrint("Women Casual Top", 399);
					case "kurti" -> addAndPrint("Women Cotton Kurti", 499);
					case "leggings" -> addAndPrint("Women Stretchable Leggings", 249);
					case "jeans" -> addAndPrint("Women Denim Jeans", 799);
					case "night-suit" -> addAndPrint("Women Night Suit Set", 549);
					default -> System.out.println("Women clothing not available.");
					}
				}
				case "kids" -> {
					System.out.println("Select Kids Clothing Type (tshirt / shorts / jeans / nightwear):");
					String kids = sc.next();
					switch (kids) {
					case "tshirt" -> addAndPrint("Kids Printed T-Shirt", 249);
					case "shorts" -> addAndPrint("Kids Cotton Shorts", 199);
					case "jeans" -> addAndPrint("Kids Denim Jeans", 499);
					case "nightwear" -> addAndPrint("Kids Night Wear Set", 349);
					default -> System.out.println("Kids clothing not available.");
					}
				}
				case "innerwear" -> {
					System.out.println("Select Innerwear Type (men / women):");
					String inner = sc.next();
					switch (inner) {
					case "men" -> addAndPrint("Men Innerwear Vest/Brief", 199);
					case "women" -> addAndPrint("Women Innerwear Set", 299);
					default -> System.out.println("Innerwear not available.");
					}
				}
				default -> System.out.println("Sorry, Clothing category not available.");
				}
			}

			case "dairy" -> {
				System.out.println("Select Dairy Product:");
				System.out.println("milk | curd | cheese | yogurt | butter | milkshakes | paneer");
				String dairy = sc.next();

				switch (dairy) {
				case "milk" -> {
					System.out.println(
							"Select Milk Type (cow / toned / double-toned / full-cream / almond / flavoured):");
					String milk = sc.next();
					switch (milk) {
					case "cow" -> addAndPrint("Fresh Cow Milk (Full Cream, 1L)", 62);
					case "toned" -> addAndPrint("Toned Milk (Low Fat, 1L)", 54);
					case "double-toned" -> addAndPrint("Double Toned Milk (Very Low Fat, 1L)", 50);
					case "full-cream" -> addAndPrint("Full Cream Milk (Rich & Thick, 1L)", 66);
					case "almond" -> addAndPrint("Almond Milk (Plant Based, 1L)", 199);
					case "flavoured" -> addAndPrint("Flavoured Milk (Chocolate/Strawberry, 200ml)", 30);
					default -> System.out.println("Sorry, The Milk you are searching is not available.");
					}
				}
				case "curd" -> {
					System.out.println("Select Curd Type (cow / buffalo / set / packet / low-fat / dahi):");
					String curd = sc.next();
					switch (curd) {
					case "cow" -> addAndPrint("Fresh Cow Milk Curd (Thick & Creamy, 500g)", 45);
					case "buffalo" -> addAndPrint("Buffalo Curd (High Fat, 500g)", 50);
					case "set" -> addAndPrint("Set Curd (Traditional Style, 400g)", 40);
					case "packet" -> addAndPrint("Packet Curd (Ready Made, 500g)", 42);
					case "low-fat" -> addAndPrint("Low Fat Curd (Diet Friendly, 400g)", 38);
					case "dahi" -> addAndPrint("Dodla Curd Bucket (1kg)", 75);
					default -> System.out.println("Sorry, The Curd you are searching is not available.");
					}
				}
				case "cheese" -> {
					System.out.println("Select Cheese Type (mozzarella / cheddar / slice / cube / processed / pizza):");
					String cheese = sc.next();
					switch (cheese) {
					case "mozzarella" -> addAndPrint("Mozzarella Cheese (200g)", 180);
					case "cheddar" -> addAndPrint("Cheddar Cheese (200g)", 220);
					case "slice" -> addAndPrint("Cheese Slices (10 slices)", 130);
					case "cube" -> addAndPrint("Cheese Cubes (12 pcs)", 110);
					case "processed" -> addAndPrint("Processed Cheese (200g)", 150);
					case "pizza" -> addAndPrint("Pizza Cheese Blend - Mozzarella Mix (200g)", 190);
					default -> System.out.println("Sorry, The Cheese you are searching is not available.");
					}
				}
				case "yogurt" -> {
					System.out.println("Select Yogurt Type (plain / greek / flavoured / probiotic / low-fat):");
					String yogurt = sc.next();
					switch (yogurt) {
					case "plain" -> addAndPrint("Plain Yogurt Cup (Fresh & Natural, 100g)", 25);
					case "greek" -> addAndPrint("Greek Yogurt (Thick & High Protein, 150g)", 60);
					case "flavoured" -> addAndPrint("Flavoured Yogurt - Mango/Strawberry/Blueberry (100g)", 30);
					case "probiotic" -> addAndPrint("Probiotic Yogurt (Good for Digestion, 100g)", 35);
					case "low-fat" -> addAndPrint("Low Fat Yogurt (Healthy Diet Option, 100g)", 28);
					default -> System.out.println("Sorry, The Yogurt you are searching is not available.");
					}
				}
				case "butter" -> {
					System.out
							.println("Select Butter Type (salted / unsalted / amul / white / garlic / herb / baking):");
					String butter = sc.next();
					switch (butter) {
					case "salted" -> addAndPrint("Salted Butter (Ready to Eat, 100g)", 55);
					case "unsalted" -> addAndPrint("Unsalted Butter (Cooking & Baking, 100g)", 55);
					case "amul" -> addAndPrint("Amul Butter (Classic Yellow Pack, 500g)", 260);
					case "white" -> addAndPrint("White Butter (Traditional Style, 200g)", 90);
					case "garlic" -> addAndPrint("Garlic Butter (Flavoured, 100g)", 80);
					case "herb" -> addAndPrint("Herb Butter (Cooking Use, 100g)", 85);
					case "baking" -> addAndPrint("Baking Butter (High Quality, 250g)", 150);
					default -> System.out.println("Sorry, The Butter you are searching is not available.");
					}
				}
				case "milkshakes" -> {
					System.out.println(
							"Select Milkshake (chocolate / vanilla / strawberry / mango / butterscotch / almond / kesar / oreo):");
					String ms = sc.next();
					switch (ms) {
					case "chocolate" -> addAndPrint("Chocolate Milkshake (Rich & Creamy, 200ml)", 50);
					case "vanilla" -> addAndPrint("Vanilla Milkshake (Classic Taste, 200ml)", 45);
					case "strawberry" -> addAndPrint("Strawberry Milkshake (Fruity & Sweet, 200ml)", 45);
					case "mango" -> addAndPrint("Mango Milkshake (Seasonal Special, 200ml)", 50);
					case "butterscotch" -> addAndPrint("Butterscotch Milkshake (Crunchy & Sweet, 200ml)", 55);
					case "almond" -> addAndPrint("Almond Milkshake (Nutty Flavor, 200ml)", 65);
					case "kesar" -> addAndPrint("Kesar Milkshake (Premium Saffron Taste, 200ml)", 70);
					case "oreo" -> addAndPrint("Oreo Milkshake (Chocolate Cookie Blend, 200ml)", 60);
					default -> System.out.println("Sorry, The Milkshake you are searching is not available.");
					}
				}
				case "paneer" -> {
					System.out.println("Select Paneer Type (fresh / malai / block / cube / low-fat / organic):");
					String paneer = sc.next();
					switch (paneer) {
					case "fresh" -> addAndPrint("Fresh Paneer (Soft & White Cottage Cheese, 200g)", 90);
					case "malai" -> addAndPrint("Malai Paneer (Rich & Creamy Texture, 200g)", 100);
					case "block" -> addAndPrint("Paneer Block (Cooking Use, 500g)", 220);
					case "cube" -> addAndPrint("Paneer Cubes (Ready to Cook, 200g)", 95);
					case "low-fat" -> addAndPrint("Low Fat Paneer (Diet Friendly, 200g)", 85);
					case "organic" -> addAndPrint("Organic Paneer (Pure Milk Based, 200g)", 130);
					default -> System.out.println("Sorry, The Paneer you are searching is not available.");
					}
				}
				default -> System.out.println("Sorry, The Dairy Product you are searching is not available.");
				}
			}

			case "kitchen" -> {
				System.out.println("Select Kitchen Category:");
				System.out.println("cookware | utensils | storage | cleaning | appliances");
				String kitchen = sc.next();

				switch (kitchen) {
				case "cookware" -> {
					System.out.println("Select Cookware Item (pan / tawa / kadai / pressure-cooker):");
					String item = sc.next();
					switch (item) {
					case "pan" -> addAndPrint("Non-Stick Frying Pan (24cm)", 599);
					case "tawa" -> addAndPrint("Roti Tawa (Non-Stick, 30cm)", 449);
					case "kadai" -> addAndPrint("Stainless Steel Kadai (3L)", 799);
					case "pressure-cooker" -> addAndPrint("Pressure Cooker (Hawkins/Prestige, 3L)", 1299);
					default -> System.out.println("Cookware item not available.");
					}
				}
				case "utensils" -> {
					System.out.println("Select Utensil Item (plate / bowl / glass / spoon / knife):");
					String item = sc.next();
					switch (item) {
					case "plate" -> addAndPrint("Stainless Steel Plate", 120);
					case "bowl" -> addAndPrint("Steel Bowl Set (6 pcs)", 349);
					case "glass" -> addAndPrint("Steel/Glass Drinking Glass (6 pcs)", 299);
					case "spoon" -> addAndPrint("Stainless Steel Spoon Set (6 pcs)", 149);
					case "knife" -> addAndPrint("Kitchen Knife Set (3 pcs)", 399);
					default -> System.out.println("Utensil item not available.");
					}
				}
				case "storage" -> {
					System.out.println("Select Storage Item (container / lunchbox / bottle / jar):");
					String item = sc.next();
					switch (item) {
					case "container" -> addAndPrint("Plastic Food Storage Container (3 pcs set)", 249);
					case "lunchbox" -> addAndPrint("Lunch Box / Tiffin Box (3 compartments)", 349);
					case "bottle" -> addAndPrint("Water Bottle (Steel, 1L)", 299);
					case "jar" -> addAndPrint("Kitchen Storage Jar Set (6 pcs)", 499);
					default -> System.out.println("Storage item not available.");
					}
				}
				case "cleaning" -> {
					System.out.println("Select Cleaning Item (scrubber / dishwash / brush / wiper):");
					String item = sc.next();
					switch (item) {
					case "scrubber" -> addAndPrint("Steel Scrubber (Pack of 3)", 40);
					case "dishwash" -> addAndPrint("Dishwash Liquid - Vim/Pril (500ml)", 85);
					case "brush" -> addAndPrint("Kitchen Cleaning Brush", 55);
					case "wiper" -> addAndPrint("Floor Wiper (Stainless Steel)", 199);
					default -> System.out.println("Cleaning item not available.");
					}
				}
				case "appliances" -> {
					System.out.println("Select Appliance (mixer / induction / toaster / kettle):");
					String item = sc.next();
					switch (item) {
					case "mixer" -> addAndPrint("Mixer Grinder (750W)", 2499);
					case "induction" -> addAndPrint("Induction Cooktop (1600W)", 1799);
					case "toaster" -> addAndPrint("Bread Toaster (2 Slice)", 899);
					case "kettle" -> addAndPrint("Electric Kettle (1.5L)", 799);
					default -> System.out.println("Appliance not available.");
					}
				}
				default -> System.out.println("Sorry, Kitchen category not available.");
				}
			}

			case "pooja" -> {
				System.out.println("Select Pooja Items:");
				System.out.println("pooja-oil | agarbatti | dhoop | cotton-wicks");
				String pooja = sc.next();

				switch (pooja) {
				case "pooja-oil" -> {
					System.out.println("Select Pooja Oil:");
					System.out.println(
							"vidhi | om_bhakti | de_naturel | shubhkart | mangalmai | om_shanthi | dheepam | om_shanthi_jasmine | shree");
					String oil = sc.next();
					switch (oil) {
					case "vidhi" -> addAndPrint("Vidhi Puja Chameli Oil (100ml)", 55);
					case "om_bhakti" -> addAndPrint("Om Bhakti Pancha Deepa Oil (500ml)", 120);
					case "de_naturel" -> addAndPrint("De Naturel Aradhika Pooja Oil (900ml)", 180);
					case "shubhkart" -> addAndPrint("Shubhkart Darshana Camphor Puja Oil (900ml)", 175);
					case "mangalmai" -> addAndPrint("Mangalmai Puja Lamp and Diya Oil (900ml)", 160);
					case "om_shanthi" -> addAndPrint("Om Shanthi Parijatha Puja Oil (1 Litre)", 190);
					case "dheepam" -> addAndPrint("Dheepam Lamp Oil Bottle (1 Litre)", 185);
					case "om_shanthi_jasmine" -> addAndPrint("Om Shanthi Jasmine Pure Puja Oil (1 Litre)", 195);
					case "shree" -> addAndPrint("Shree Aradhana Gold Pure Pooja Oil (1 Litre)", 200);
					default -> System.out.println("Sorry, The Pooja Oil you are searching is not available.");
					}
				}
				case "agarbatti" -> {
					System.out.println(
							"Select Agarbatti (mangaldeep / cycle / flute / lavender / sandal / rose / jasmine / flora):");
					String ag = sc.next();
					switch (ag) {
					case "mangaldeep" -> addAndPrint("Mangaldeep 3 in 1 Premium Agarbatti (114g)", 75);
					case "cycle" -> addAndPrint("Cycle Pure Agarbatti (100 sticks)", 55);
					case "flute" -> addAndPrint("Flute Premium Agarbatti (100 sticks)", 60);
					case "lavender" -> addAndPrint("Lavender Agarbatti Pack (100 sticks)", 65);
					case "sandal" -> addAndPrint("Sandalwood Premium Agarbatti (100 sticks)", 80);
					case "rose" -> addAndPrint("Rose Fragrance Agarbatti (100 sticks)", 60);
					case "jasmine" -> addAndPrint("Jasmine Agarbatti (100 sticks)", 60);
					case "flora" -> addAndPrint("Flora Premium Agarbatti Pack (100 sticks)", 70);
					default -> System.out.println("Sorry, The Agarbatti you are searching is not available.");
					}
				}
				case "dhoop" -> {
					System.out.println(
							"Select Dhoop (cycle / mangaldeep / cup / cone / sandal / jasmine / sambrani / loban / wet / dry):");
					String dhoop = sc.next();
					switch (dhoop) {
					case "cycle" -> addAndPrint("Cycle Dhoop Sticks Pack (20 sticks)", 40);
					case "mangaldeep" -> addAndPrint("Mangaldeep Dhoop Cones (12 cones)", 45);
					case "cup" -> addAndPrint("Cup Dhoop / Havan Cups (12 pcs)", 50);
					case "cone" -> addAndPrint("Dhoop Cones Pack (12 cones)", 40);
					case "sandal" -> addAndPrint("Sandalwood Dhoop (20 sticks)", 55);
					case "jasmine" -> addAndPrint("Jasmine Dhoop (20 sticks)", 45);
					case "sambrani" -> addAndPrint("Sambrani Dhoop Cups (10 pcs)", 60);
					case "loban" -> addAndPrint("Loban Dhoop (50g)", 70);
					case "wet" -> addAndPrint("Wet Dhoop (100g)", 50);
					case "dry" -> addAndPrint("Dry Dhoop Sticks (20 sticks)", 40);
					default -> System.out.println("Sorry, The Dhoop you are searching is not available.");
					}
				}
				case "cotton-wicks" -> {
					System.out.println(
							"Select Cotton Wicks (long / round / phool / akhand / ghee_batti / handmade / premium / regular):");
					String wicks = sc.next();
					switch (wicks) {
					case "long" -> addAndPrint("Long Cotton Wicks / Diya Batti (100 pcs)", 30);
					case "round" -> addAndPrint("Round Cotton Wicks (100 pcs)", 25);
					case "phool" -> addAndPrint("Phool / Flower Cotton Wicks (50 pcs)", 35);
					case "akhand" -> addAndPrint("Akhand Diya Long Wicks (50 pcs)", 40);
					case "ghee_batti" -> addAndPrint("Ghee Ready Cotton Batti (50 pcs)", 45);
					case "handmade" -> addAndPrint("Handmade Cotton Wicks (100 pcs)", 35);
					case "premium" -> addAndPrint("Premium Cotton Wicks Pack (100 pcs)", 50);
					case "regular" -> addAndPrint("Regular Daily Use Cotton Wicks (100 pcs)", 20);
					default -> System.out.println("Sorry, The Cotton Wicks you are searching is not available.");
					}
				}
				default -> System.out.println("Sorry, The Pooja Item you are searching is not available.");
				}
			}

			}
			System.out.println("\nDo you want to continue shopping? (yes/no)");
			again = sc.next();
		} while (again.equalsIgnoreCase("yes"));
		printBill();
		sc.close();	
	}

	static void printBill() {
		System.out.println("\n================= DMART BILL =================\n");
		System.out.println(bill.toString());
		System.out.println("----------------------------------------------");

		double gstRate = 0.05;
		double gstAmount = total * gstRate;
		double finalAmt = total + gstAmount;

		System.out.printf("SUB TOTAL            : ₹%.2f%n", total);
		System.out.printf("GST (5%%)             : ₹%.2f%n", gstAmount);
		System.out.println("----------------------------------------------");
		System.out.printf("TOTAL (INCL. GST)    : ₹%.2f%n", finalAmt);
		System.out.println("----------------------------------------------");
		System.out.println("THANK YOU FOR SHOPPING AT DMART 🛒");
		System.out.println("VISIT AGAIN!");
	}
}
