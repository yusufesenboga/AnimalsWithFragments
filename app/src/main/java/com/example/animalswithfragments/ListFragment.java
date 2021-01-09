package com.example.animalswithfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    private ArrayList<Animal> animalList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_view);

        createAnimal("Dog",R.drawable.dog,"The dog (Canis familiaris when considered a distinct species or Canis lupus familiaris when considered a subspecies of the wolf)[5] is a domesticated carnivore of the family Canidae. It is part of the wolf-like canids,[6] and is the most widely abundant terrestrial carnivore.[7][8][9][10][11] The dog and the extant gray wolf are sister taxa as modern wolves are not closely related to the wolves that were first domesticated,[12][13][14] which implies that the direct ancestor of the dog is extinct.[15] The dog was the first species to be domesticated,[14][16] and has been selectively bred over millennia for various behaviors, sensory capabilities, and physical attributes.[17]\n" +
                "\n" +
                "Their long association with humans has led dogs to be uniquely attuned to human behavior,[18] and they can thrive on a starch-rich diet that would be inadequate for other canids.[19] Dogs vary widely in shape, size, and colors.[20] They perform many roles for humans, such as hunting, herding, pulling loads, protection, assisting police and military, companionship, and, more recently, aiding disabled people, and therapeutic roles. This influence on human society has given them the sobriquet of \"man's best friend.\"");
        createAnimal("Cat",R.drawable.cat,"The cat (Felis catus) is a domestic species of small carnivorous mammal.[1][2] It is the only domesticated species in the family Felidae and is often referred to as the domestic cat to distinguish it from the wild members of the family.[4] A cat can either be a house cat, a farm cat or a feral cat; the latter ranges freely and avoids human contact.[5] Domestic cats are valued by humans for companionship and their ability to hunt rodents. About 60 cat breeds are recognized by various cat registries.[6]\n" +
                "\n" +
                "The cat is similar in anatomy to the other felid species: it has a strong flexible body, quick reflexes, sharp teeth and retractable claws adapted to killing small prey. Its night vision and sense of smell are well developed. Cat communication includes vocalizations like meowing, purring, trilling, hissing, growling and grunting as well as cat-specific body language. A predator that is most active at dawn and dusk, the cat is a solitary hunter but a social species. It can hear sounds too faint or too high in frequency for human ears, such as those made by mice and other small mammals.[7] It secretes and perceives pheromones.[8]\n" +
                "\n" +
                "Female domestic cats can have kittens from spring to late autumn, with litter sizes often ranging from two to five kittens.[9] Domestic cats are bred and shown at events as registered pedigreed cats, a hobby known as cat fancy. Failure to control breeding of pet cats by spaying and neutering, as well as abandonment of pets, resulted in large numbers of feral cats worldwide, contributing to the extinction of entire bird, mammal, and reptile species, and evoking population control.[10]\n" +
                "\n" +
                "Cats were first domesticated in the Near East around 7500 BC.[11] It was long thought that cat domestication was initiated in ancient Egypt, as since around 3100 BC veneration was given to cats in ancient Egypt.[12][13] As of 2017, the domestic cat was the second-most popular pet in the United States, with 95 million cats owned.[14][15][16] In the United Kingdom, around 7.3 million cats lived in more than 4.8 million households as of 2019.[17]");
        createAnimal("Fox",R.drawable.fox,"Foxes are small to medium-sized, omnivorous mammals belonging to several genera of the family Canidae. Foxes have a flattened skull, upright triangular ears, a pointed, slightly upturned snout, and a long bushy tail (or brush).\n" +
                "\n" +
                "Twelve species belong to the monophyletic \"true foxes\" group of genus Vulpes. Approximately another 25 current or extinct species are always or sometimes called foxes; these foxes are either part of the paraphyletic group of the South American foxes, or of the outlying group, which consists of the bat-eared fox, gray fox, and island fox.[1] Foxes live on every continent except Antarctica. By far the most common and widespread species of fox is the red fox (Vulpes vulpes) with about 47 recognized subspecies.[2] The global distribution of foxes, together with their widespread reputation for cunning, has contributed to their prominence in popular culture and folklore in many societies around the world. The hunting of foxes with packs of hounds, long an established pursuit in Europe, especially in the British Isles, was exported by European settlers to various parts of the New World.");
        createAnimal("Raccoon",R.drawable.racoon,"The raccoon (/rəˈkuːn/ or US: /ræˈkuːn/ (About this soundlisten), Procyon lotor), sometimes called the common raccoon to distinguish it from other species, is a medium-sized mammal native to North America. It is the largest of the procyonid family, having a body length of 40 to 70 cm (16 to 28 in), and a body weight of 5 to 26 kg (11 to 57 lb). Its grayish coat mostly consists of dense underfur, which insulates it against cold weather. Three of the raccoon's most distinctive features are its extremely dexterous front paws, its facial mask, and its ringed tail, which are themes in the mythologies of the indigenous peoples of the Americas relating to the animal. The raccoon is noted for its intelligence, as studies show that it is able to remember the solution to tasks for at least three years. It is usually nocturnal and omnivorous, eating about 40% invertebrates, 33% plants, and 27% vertebrates.\n" +
                "\n" +
                "The original habitats of the raccoon are deciduous and mixed forests, but due to their adaptability, they have extended their range to mountainous areas, coastal marshes, and urban areas, where some homeowners consider them to be pests. As a result of escapes and deliberate introductions in the mid-20th century, raccoons are now also distributed across much of mainland Europe, the Caucasus, and Japan.\n" +
                "\n" +
                "Though previously thought to be generally solitary, there is now evidence that raccoons engage in sex-specific social behavior. Related females often share a common area, while unrelated males live together in groups of up to four raccoons, in order to maintain their positions against foreign males during the mating season, and other potential invaders. Home range sizes vary anywhere from 3 hectares (7.4 acres) for females in cities, to 5,000 hectares (12,000 acres) for males in prairies. After a gestation period of about 65 days, two to five young, known as \"kits\", are born in spring. The kits are subsequently raised by their mother until dispersal in late fall. Although captive raccoons have been known to live over 20 years, their life expectancy in the wild is only 1.8 to 3.1 years. In many areas, hunting and vehicular injury are the two most common causes of death.");
        createAnimal("Rabbit",R.drawable.rabbit,"Rabbits are small mammals in the family Leporidae of the order Lagomorpha (along with the hare and the pika). Oryctolagus cuniculus includes the European rabbit species and its descendants, the world's 305 breeds[1] of domestic rabbit. Sylvilagus includes 13 wild rabbit species, among them the seven types of cottontail. The European rabbit, which has been introduced on every continent except Antarctica, is familiar throughout the world as a wild prey animal and as a domesticated form of livestock and pet. With its widespread effect on ecologies and cultures, the rabbit (or bunny) is, in many areas of the world, a part of daily life—as food, clothing, a companion, and a source of artistic inspiration.\n" +
                "\n" +
                "Although once considered rodents, lagomorphs like rabbits have been discovered to have diverged separately and earlier than their rodent cousins, and have a number of traits rodents lack, like two extra incisors.Male rabbits are called bucks; females are called does. An older term for an adult rabbit is coney (derived ultimately from the Latin cuniculus), while rabbit once referred only to the young animals.[2] Another term for a young rabbit is bunny, though this term is often applied informally (particularly by children) to rabbits generally, especially domestic ones. More recently, the term kit or kitten has been used to refer to a young rabbit.\n" +
                "\n" +
                "A group of rabbits is known as a colony or nest (or, occasionally, a warren, though this more commonly refers to where the rabbits live).[3] A group of baby rabbits produced from a single mating is referred to as a litter,[4] and a group of domestic rabbits living together is sometimes called a herd.[5]");
        createAnimal("Hamster",R.drawable.hamster,"Hamsters are rodents (order Rodentia) belonging to the subfamily Cricetinae, which contains 19 species classified in seven genera.[1][2] They have become established as popular small pets.[3] The best-known species of hamster is the golden or Syrian hamster (Mesocricetus auratus), which is the type most commonly kept as pets. Other hamster species commonly kept as pets are the three species of dwarf hamster, Campbell's dwarf hamster (Phodopus campbelli), the winter white dwarf hamster (Phodopus sungorus) and the Roborovski hamster (Phodopus roborovskii).\n" +
                "\n" +
                "Hamsters are more crepuscular than nocturnal and, in the wild, remain underground during the day to avoid being caught by predators. They feed primarily on seeds, fruits, and vegetation, and will occasionally eat burrowing insects.[4] Physically, they are stout-bodied with distinguishing features that include elongated cheek pouches extending to their shoulders, which they use to carry food back to their burrows, as well as a short tail and fur-covered feet.");
        createAnimal("Penguin",R.drawable.penguin,"Penguins (order Sphenisciformes /sfɪˈnɪsɪfɔːrmiːz/, family Spheniscidae /sfɪˈnɪsɪdiː/) are a group of aquatic flightless birds. They live almost exclusively in the Southern Hemisphere, with only one species, the Galápagos penguin, found north of the equator. Highly adapted for life in the water, penguins have countershaded dark and white plumage and flippers for swimming. Most penguins feed on krill, fish, squid and other forms of sea life which they catch while swimming underwater. They spend roughly half of their lives on land and the other half in the sea.\n" +
                "\n" +
                "Although almost all penguin species are native to the Southern Hemisphere, they are not found only in cold climates, such as Antarctica. In fact, only a few species of penguin live so far south. Several species are found in the temperate zone, but one species, the Galápagos penguin, lives near the equator.\n" +
                "\n" +
                "The largest living species is the emperor penguin (Aptenodytes forsteri):[1] on average, adults are about 1.1 m (3 ft 7 in) tall and weigh 35 kg (77 lb). The smallest penguin species is the little blue penguin (Eudyptula minor), also known as the fairy penguin, which stands around 33 cm (13 in) tall and weighs 1 kg (2.2 lb).[2] Among extant penguins, larger penguins inhabit colder regions, while smaller penguins are generally found in temperate or even tropical climates. Some prehistoric species attained enormous sizes, becoming as tall or as heavy as an adult human. These were not restricted to Antarctic regions; on the contrary, subantarctic regions harboured high diversity, and at least one giant penguin occurred in a region around 2,000 km south of the equator 35 mya, in a climate decidedly warmer than today.");

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

    AnimalViewAdapter adapter = new AnimalViewAdapter(animalList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setAnimalClickListener(new AnimalClickListener() {
            @Override
            public void onClick(int position) {
                Bundle bundle = new Bundle();
                bundle.putString("titleKey",animalList.get(position).title);
                bundle.putString("longDescriptionKey",animalList.get(position).longDescription);
                bundle.putInt("imageIDKey",animalList.get(position).imageID);
                getParentFragmentManager().setFragmentResult("animalKey", bundle);

                ((MainActivity) getActivity()).onClick(view);
            }
        });
    }
    public void createAnimal(String title, int imageID, String longDescription) {
        Animal animal = new Animal(title, longDescription, imageID);
        animalList.add(animal);
    }
}